package parkingLot.strategy.feeCalculationStrategy;

import parkingLot.models.Ticket;

public interface FeeCalculationStrategy {
    long getFeeAmount(Ticket ticket);
}
