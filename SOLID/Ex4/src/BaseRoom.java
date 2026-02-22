public class BaseRoom implements RoomTypeI {
    @Override
    public boolean isRequired(int roomTypeFlag) {
        return true;
    }

    @Override
    public double getPrice() {
        return 16000.0;
    }

}
