public class Laundry implements AddOnI {

    @Override
    public double getPricing() {
        return 500.0;
    }

    @Override
    public AddOn getAddOn() {
        return AddOn.LAUNDRY;
    }

}