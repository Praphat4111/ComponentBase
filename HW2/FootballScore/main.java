import java.util.*;

class main{
   public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 

        Person1 obj1 = new Person1();
        Person2 obj2 = new Person2();
        HeadQuater obj = new HeadQuater();
        obj.register(obj1);
        obj.register(obj2);
        while(true){
            System.out.print("Enter Score : "); String data= inp.nextLine();
            if(data.equals("")) return ;
            obj.setSomeData(data);
        }  
    }
}