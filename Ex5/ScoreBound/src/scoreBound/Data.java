package scoreBound;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Data {
    
    private String string;

    public static final String PROP_STRING = "string";

    public String getString() {
        return string;
    }

    public void setString(String string) {
        String oldString = this.string;
        this.string = string;
        propertyChangeSupport.firePropertyChange(PROP_STRING, oldString, string);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
