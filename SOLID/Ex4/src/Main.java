import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Hostel Fee Calculator ===");
        BookingRequest req = new BookingRequest(LegacyRoomTypes.DOUBLE, List.of(AddOn.LAUNDRY, AddOn.MESS));
        List<RoomTypeI> roomTypes = List.of(new SingleRoom(), new DoubleRoom(), new TripleRoom(), new BaseRoom());
        List<AddOnI> addOns = List.of(new Laundry(), new Mess(), new Gym());
        HostelFeeCalculator calc = new HostelFeeCalculator(new TotalRoomPrice(roomTypes), new TotalAddOn(addOns),
                new FakeBookingRepo());
        calc.process(req);
    }
}
