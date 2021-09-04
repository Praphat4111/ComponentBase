import java.util.*;

public class HeadQuater implements Source{

    private final ArrayList<MyObserver> list;
    private String someData;

    public HeadQuater(){
        this.list = new ArrayList<MyObserver>();
    }
    public void setSomeData(String data){
        someData = data;
        notifyObservers();
    }
    public String getSomeData(){
        return someData;
    }
    public void register(MyObserver observer){
        list.add(observer);
    }
    public void notifyObservers(){
        for(int j=0;j<list.size();++j){
            list.get(j).update(this);
        }
    }
}
