package parkingLot.strategy.spotAllocationStrategy;

import parkingLot.repository.ParkingLotRepository;

public class SpotAllocationFactory {
    public static SpotAllocationStrategy getSpotAllocationStrategy(ParkingLotRepository parkingLotRepository){
        return new RandomSpotAllocationStrategy(parkingLotRepository);
    }
}
