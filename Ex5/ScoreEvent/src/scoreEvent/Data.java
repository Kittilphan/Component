package scoreEvent;

import java.util.EventObject;

public class Data extends EventObject {
    private String someData;
    public String getSomeData() {
        return someData;
    }
    public Data(Object o, String value) {
        super(o);
        someData = value;
    }
}
