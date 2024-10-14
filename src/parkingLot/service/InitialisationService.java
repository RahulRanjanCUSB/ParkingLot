package parkingLot.service;


import parkingLot.models.*;
import parkingLot.repository.GateRepository;
import parkingLot.repository.ParkingFloorRepository;
import parkingLot.repository.ParkingLotRepository;
import parkingLot.repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;


    public InitialisationService() {
        this.gateRepository = new GateRepository();
        this.parkingLotRepository = new ParkingLotRepository();
        this.parkingFloorRepository = new ParkingFloorRepository();
        this.parkingSpotRepository = new ParkingSpotRepository();
    }

    public ParkingLot initialize(){

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setStatus(Status.ACTIVE);
        parkingLot.setAddress("1st Cross Road, Kundanhalli");
        parkingLot.setCapacity(100);

        Gate entryGate = new Gate();
        entryGate.setId(1);
        entryGate.setOperator("Ram Kumar");
        entryGate.setGateNumber(1);
        entryGate.setGateType(GateType.ENTRY);
        entryGate.setFloorNumber(1);
        entryGate.setStatus(Status.ACTIVE);
        entryGate.setParkingLotId(1);

        Gate exitGate = new Gate();
        exitGate.setId(2);
        exitGate.setOperator("Mohan Kumar");
        exitGate.setGateNumber(2);
        exitGate.setGateType(GateType.EXIT);
        exitGate.setFloorNumber(1);
        exitGate.setStatus(Status.ACTIVE);
        exitGate.setParkingLotId(1);

        parkingLot.setGates(List.of(exitGate, entryGate));
        gateRepository.put(entryGate);
        gateRepository.put(exitGate);

        //Create floor for parking lot and spots for floor

        List<ParkingFloor> parkingFloors = new ArrayList<>();

        for(int i=1; i<=10; i++){
            ParkingFloor parkingFloor = new ParkingFloor();
            List<ParkingSpot> parkingSpots = new ArrayList<>();
            parkingFloor.setId(100 + i);
            parkingFloor.setStatus(Status.ACTIVE);
            parkingFloor.setFloorNumber(i);
            for(int j=1; j<=10; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(1000+j);
                parkingSpot.setNumber(i*10+j);
                if(j%2==0){
                    parkingSpot.setSupportedVehicleType(VehicleType.TWO_WHEELER);
                }
                else {
                    parkingSpot.setSupportedVehicleType(VehicleType.FOUR_WHEELER);
                }
                parkingSpot.setStatus(Status.AVAILABLE);
                parkingSpots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }
            parkingFloor.setParkingSpots(parkingSpots);
            parkingFloorRepository.put(parkingFloor);
            parkingFloors.add(parkingFloor);
        }

        //Add parking floors in parking lot
        parkingLot.setParkingFloors(parkingFloors);
        parkingLotRepository.put(parkingLot);
        return parkingLot;

    }
}
