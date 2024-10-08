package parkingLot.models;

import javax.security.auth.kerberos.KerberosTicket;
import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private int amount;
    private Ticket ticket;
    private Gate gate;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
