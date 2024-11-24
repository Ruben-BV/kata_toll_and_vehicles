package dev.rubenblanco.kata_toll_and_vehicles;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TollStationTest {

    private TollStation testTollStation;
    private List<Vehicle> vehicles;
    private Vehicle vehicle1;
    private Vehicle vehicle2;
    private Vehicle vehicle3;

    @BeforeEach
    public void setUp() {
        vehicle1 = new Vehicle(1L, VehicleType.car, "ABC123", 2);
        vehicle2 = new Vehicle(2L, VehicleType.motorcycle, "DEF456", 2);
        vehicle3 = new Vehicle(3L, VehicleType.truck, "GHI789", 4);
        vehicles = new ArrayList<>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);
        testTollStation = new TollStation(1, "Toll Station 1", "City 1", 0, vehicles);
    }


    @Test
    void testCalculateTollFeeCar() {
        int result = testTollStation.calculateTollFee(vehicle1);
        assertEquals(100, result);
    }

    @Test
    void testCalculateTollFeeMotorcycle() {
        int result = testTollStation.calculateTollFee(vehicle2);
        assertEquals(50, result);
    }

    @Test
    void testCalculateTollFeeTruck() {
        int result = testTollStation.calculateTollFee(vehicle3);
        assertEquals(200, result);
    }

    @Test
    void testCalculateTotalCollected() {
        
        testTollStation.calculateTotalCollected();
        assertEquals(350, testTollStation.getTotalCollected());
    }

    @Test
    void testCountVehicles() {
        int result = testTollStation.countVehicles();
        assertEquals(3, result);
    }

    @Test
    void testSetAndGetCity() {
        
        testTollStation.setCity("New City");
        String result = testTollStation.getCity();

        assertEquals("New City", result);
    }

    @Test
    void testSetAndGetName() {
        testTollStation.setName("New Tollstation");
        String result = testTollStation.getName();

        assertEquals("New Tollstation", result);
    }

    @Test
    void testSetAndGetTollStationId() {
        testTollStation.setTollStationId(2L);
        long result = testTollStation.getTollStationId();

        assertEquals(2L, result);
    }

    @Test
    void testSetAndGetTotalCollected() {
        double testTotalCollected = 500;

        testTollStation.setTotalCollected(testTotalCollected);
        assertEquals(500, testTollStation.getTotalCollected());
    }

    @Test
    void testGetVehicleList() {
        int result = testTollStation.getVehicleList().size();
        assertEquals(3, result);
    }


    @Test
    void testSummary() {
        testTollStation.calculateTotalCollected();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        testTollStation.summary();

        System.setOut(System.out);

        String expectedOutput =
            "Toll Station: Toll Station 1\n" +
            "City: City 1\n" +
            "Number of vehicles: 3\n" +
            "Total collected: 350.0€\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
    
    
    
}
