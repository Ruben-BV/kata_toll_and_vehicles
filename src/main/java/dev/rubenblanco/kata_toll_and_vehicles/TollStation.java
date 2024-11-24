package dev.rubenblanco.kata_toll_and_vehicles;

import java.util.List;

public class TollStation {
    long tollStationId;
    String name;
    String city;
    double totalCollected;
    List<Vehicle> vehicleList;



    public TollStation(long tollStationId, String name, String city, double totalCollected, List<Vehicle> vehicleList) {
        this.tollStationId = tollStationId;
        this.name = name;
        this.city = city;
        this.totalCollected = totalCollected;
        this.vehicleList = vehicleList;
    }
    
    
    public long getTollStationId() {
        return tollStationId;
    }


    public void setTollStationId(long tollStationId) {
        this.tollStationId = tollStationId;
    }
    
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }
    
    
    
    public double getTotalCollected() {
        return totalCollected;
    }
    
    
    public void setTotalCollected(double totalCollected) {
        this.totalCollected = totalCollected;
    }
    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public int calculateTollFee(Vehicle vehicle) {
    
        if(vehicle.getVehicleType().equals(VehicleType.car)){
            return 100;
        }
        else if(vehicle.getVehicleType().equals(VehicleType.motorcycle)){
            return 50;
        }
        else {
            return vehicle.getNumberOfAxis()*50;
        }
    }

    public int countVehicles () {
        return vehicleList.size();
    }

    
    public void calculateTotalCollected() {
        for (Vehicle vehicle : vehicleList) {
            totalCollected += calculateTollFee(vehicle);
        }
    }
    
    public void summary() {
        System.out.println("Toll Station: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of vehicles: " + countVehicles());
        System.out.println("Total collected: " + totalCollected + "€" );
    }
}
