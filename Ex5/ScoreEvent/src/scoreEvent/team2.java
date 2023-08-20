package scoreEvent;

public class team2 implements MyObserver {
    @Override
    public void update(Data o) {
        System.out.println("live result: "+((Data)o).getSomeData());
    }
}
