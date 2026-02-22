public class TripleRoom implements RoomTypeI {
    @Override
    public boolean isRequired(int roomTypeFlag) {
        return roomTypeFlag == LegacyRoomTypes.TRIPLE;
    }

    @Override
    public double getPrice() {
        return 12000.0;
    }
}
