import java.util.*;

public class HostelFeeCalculator {
    private final FakeBookingRepo repo;
    private final TotalRoomPrice totalRoomPrice;
    private final TotalAddOn totalAddOn;

    public HostelFeeCalculator(TotalRoomPrice totalRoomPrice, TotalAddOn totalAddOn, FakeBookingRepo repo) {
        this.totalRoomPrice = totalRoomPrice;
        this.totalAddOn = totalAddOn;
        this.repo = repo;
    }

    // OCP violation: switch + add-on branching + printing + persistence.
    public void process(BookingRequest req) {
        Money monthly = calculateMonthly(req);
        Money deposit = new Money(5000.00);

        ReceiptPrinter.print(req, monthly, deposit);

        String bookingId = "H-" + (7000 + new Random(1).nextInt(1000)); // deterministic-ish
        repo.save(bookingId, req, monthly, deposit);
    }

    private Money calculateMonthly(BookingRequest req) {
        double roomPrice = this.totalRoomPrice.calculateTotalPrice(req.roomType);
        double addOnPrice = this.totalAddOn.calculateTotalAddOn(req.addOns);
        return new Money(roomPrice + addOnPrice);
    }
}
