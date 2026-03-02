import java.util.*;

public class DeviceRegistry {

    private final List<Object> devices = new ArrayList<>();

    public void add(Object d) {
        devices.add(d);
    }

    public <T> T getDevice(Class<T> classType) {
        for (Object d : devices) {
            if (classType.isInstance(d))
                return classType.cast(d);
        }
        throw new IllegalStateException("Missing: " + classType.getSimpleName());
    }
}