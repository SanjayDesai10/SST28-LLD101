public class Mess implements AddOnI {

    @Override
    public double getPricing() {
        return 1000.0;
    }

    @Override
    public AddOn getAddOn() {
        return AddOn.MESS;
    }
}