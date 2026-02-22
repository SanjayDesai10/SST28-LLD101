public class SingleRoom implements RoomTypeI {
    @Override
    public boolean isRequired(int roomTypeFlag) {
        return roomTypeFlag == LegacyRoomTypes.SINGLE;
    }

    @Override
    public double getPrice() {
        return 14000.0;
    }
}
