package scoreEvent;

public class team1 implements MyObserver {
    @Override
    public void update(Data o) {
        System.out.println("live result: "+((Data)o).getSomeData());
    }
}
