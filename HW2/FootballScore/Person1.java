public class Person1 implements MyObserver {
    public void update(Source o){
        System.out.println("(Person1)live result: "+((HeadQuater)o).getSomeData());
    }
}
