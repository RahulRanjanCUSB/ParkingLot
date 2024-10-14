package parkingLot.repository;

import parkingLot.exception.TicketNotFoundException;
import parkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;


public class TicketRepository {
    private Map<Integer, Ticket> ticketMap;

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }
    public Ticket get(int TicketId){
        Ticket ticket = ticketMap.get(TicketId);
        if(ticket == null){
            throw new TicketNotFoundException("Ticket not found for: "+ ticket);
        }
        return ticket;
    }

    public void put(Ticket ticket){
        ticketMap.put(ticket.getId(), ticket);
        System.out.println("Ticket has been added successfully");
    }
}

