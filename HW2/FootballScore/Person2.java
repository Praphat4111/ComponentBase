public class Person2 implements MyObserver{
    public void update(Source o){
        System.out.println("(Person2)live result: "+((HeadQuater)o).getSomeData());

    }
}
