package scoreEvent;

import java.util.EventListener;

public interface MyObserver extends EventListener {
    public void update(Data evt);
}
