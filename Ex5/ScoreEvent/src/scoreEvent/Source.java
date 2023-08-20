package scoreEvent;

import java.util.ArrayList;

public class Source {
    ArrayList<MyObserver> observers;
    
    public Source() {
        observers = new ArrayList<>();
    }
    
    public void addObserver(MyObserver obj) {
        observers.add(obj);
    }
    
    public void setSomedata(String value) {
        fireHeadQuaterEvent(new Data(this, value));
    }
    
    public void fireHeadQuaterEvent(Data evt) {
        for(MyObserver observer : observers) {
            observer.update(evt);
        }
    }
}
