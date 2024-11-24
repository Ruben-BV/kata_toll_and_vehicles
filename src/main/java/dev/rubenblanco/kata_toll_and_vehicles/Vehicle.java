package dev.rubenblanco.kata_toll_and_vehicles;


public class Vehicle {
    long vehicleId;
    VehicleType vehicleType;
    String licensePlate;
    
    public Vehicle(long vehicleId, VehicleType vehicleType, String licensePlate) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
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
    
}

enum VehicleType {
    car,
    motorcycle,
    truck;
}