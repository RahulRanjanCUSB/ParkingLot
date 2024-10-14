import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSpot;
import parkingLot.repository.ParkingLotRepository;
import parkingLot.service.InitialisationService;

public class Main {
    private InitialisationService initialisationService;

    public Main(){
        this.initialisationService = new InitialisationService();
    }
    public static void main(String[] args) {
        Main main = new Main();
        ParkingLot parkingLot =  main.initialisationService.initialize();
        System.out.println("Hello world!");
    }
}