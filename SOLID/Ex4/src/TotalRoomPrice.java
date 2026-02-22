import java.util.List;

public class TotalRoomPrice {
    private final List<RoomTypeI> roomTypes;

    public TotalRoomPrice(List<RoomTypeI> roomTypes) {
        this.roomTypes = roomTypes;
    }

    public double calculateTotalPrice(int requestedRoomTypeFlag) {
        for (RoomTypeI rp : roomTypes) {
            if (rp.isRequired(requestedRoomTypeFlag)) {
                return rp.getPrice();
            }
        }
        return new BaseRoom().getPrice();
    }
}
