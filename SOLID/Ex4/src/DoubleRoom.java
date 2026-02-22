public class DoubleRoom implements RoomTypeI {
    @Override
    public boolean isRequired(int roomTypeFlag) {
        return roomTypeFlag == LegacyRoomTypes.DOUBLE;
    }

    @Override
    public double getPrice() {
        return 15000.0;
    }
}
