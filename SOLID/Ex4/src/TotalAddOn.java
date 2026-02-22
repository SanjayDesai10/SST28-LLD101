
import java.util.List;

public class TotalAddOn {
    List<AddOnI> addOns;

    public TotalAddOn(List<AddOnI> addOns) {
        this.addOns = addOns;
    }

    public double calculateTotalAddOn(List<AddOn> requestedAddOns) {
        double price = 0.0;
        for (AddOnI e : addOns) {
            if (requestedAddOns.contains(e.getAddOn())) {
                price += e.getPricing();
            }
        }
        return price;
    }
}
