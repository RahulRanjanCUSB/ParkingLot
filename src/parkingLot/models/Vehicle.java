package parkingLot.models;

public class Vehicle {
    private int id;
    private string number;
    private string color;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public string getColor() {
        return color;
    }

    private VehicleType vehicleType;

    public string getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(string number) {
        this.number = number;
    }

    public void setColor(string color) {
        this.color = color;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
