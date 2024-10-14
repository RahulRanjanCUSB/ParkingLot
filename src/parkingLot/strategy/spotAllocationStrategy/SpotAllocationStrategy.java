package parkingLot.strategy.spotAllocationStrategy;

import parkingLot.models.Gate;
import parkingLot.models.ParkingSpot;
import parkingLot.models.VehicleType;

public interface SpotAllocationStrategy {
    ParkingSpot getSpot(VehicleType vehicleType, Gate gate);
}
