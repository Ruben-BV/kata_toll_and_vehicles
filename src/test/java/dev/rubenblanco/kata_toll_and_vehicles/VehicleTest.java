package dev.rubenblanco.kata_toll_and_vehicles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    private Vehicle testVehicle;

    @BeforeEach
    public void init() {
        this.testVehicle = new Vehicle();
    }
    
    
    @Test
    void testConstructor() {
        long vehicleId = 2;
        VehicleType vehicleType = VehicleType.truck;;
        String licensePlate = "DEF456";
        int numberOfAxis = 3;

        Vehicle result = new Vehicle(vehicleId, vehicleType, licensePlate, numberOfAxis);

        assertEquals(2, result.getVehicleId());
        assertEquals(VehicleType.truck, result.getVehicleType());
        assertEquals("DEF456", result.getLicensePlate());
        assertEquals(3, result.getNumberOfAxis());
    }



    @Test
    void testSetAndGetLicensePlate() {

        testVehicle.setLicensePlate("ABC123");
        String result = testVehicle.getLicensePlate();
        
        assertEquals("ABC123", result);
        
    }

    @Test
    void testSetAndGetNumberOfAxis() {
        testVehicle.setNumberOfAxis(2);
        int result = testVehicle.getNumberOfAxis();
        
        assertEquals(2, result);
    }

    @Test
    void testSetAndGetVehicleId() {
        
        testVehicle.setVehicleId(1);
        long result = testVehicle.getVehicleId();
        
        assertEquals(1, result);
    }

    @Test
    void testSetAndGetVehicleType() {
        
        testVehicle.setVehicleType(VehicleType.car);
        VehicleType result = testVehicle.getVehicleType();
        
        assertEquals(VehicleType.car, result);
    }

    
}
