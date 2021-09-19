/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.util.*;
/**
 *
 * @author PRAPHAT
 */
public class BoundProperty {
    public static void main(String[] args){
          MyPropertyBean mySouse = new MyPropertyBean();
          Listener1 listener1 = new Listener1();
          Listener2 listener2 = new Listener2();
            mySouse.addPropertyChangeListener(listener1);
            mySouse.addPropertyChangeListener(listener2);
          Scanner inp = new Scanner(System.in);
         
          while(true){
           System.out.print("Enter score : "); String score = inp.nextLine(); 
           if(score.equals("")) return;
           mySouse.setValue(score);
           System.out.println("------------------------------");
        }
    }
    
          
}
