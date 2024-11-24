package dev.rubenblanco.kata_toll_and_vehicles;


public class Vehicle {
    long vehicleId;
    VehicleType vehicleType;
    String licensePlate;
    int numberOfAxis;
    public Vehicle(long vehicleId, VehicleType vehicleType, String licensePlate, int numberOfAxis) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
        this.numberOfAxis = numberOfAxis;
    }
    public long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public int getNumberOfAxis() {
        return numberOfAxis;
    }
    public void setNumberOfAxis(int numberOfAxis) {
        this.numberOfAxis = numberOfAxis;
    }
    
    
    
}

enum VehicleType {
    car,
    motorcycle,
    truck;
}