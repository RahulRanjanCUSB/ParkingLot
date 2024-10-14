package parkingLot.models;

public class Vehicle extends BaseModel {
    private int id;
    private String number;
    private String color;
    private String make;
    private VehicleType vehicleType;

    public Vehicle(){}

    public Vehicle(String vehicleNumber, String vehicleColor, String vehicleMake, VehicleType vehicleType) {
        this.number = vehicleNumber;
        this.color = vehicleColor;
        this.make = vehicleMake;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }
	    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
