/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
     private static Customer customer;
   
    
    public static void main(String[] args) {
         //CustomerMailApplication app = new CustomerMailApplication();
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();

        switch(type) {
            case 1:
                customer = CustomerFactory.creatCustomer("Regular");
                break;
            case 2:
                customer = CustomerFactory.creatCustomer("Mountain");
                break;
            case 3:
                customer = CustomerFactory.creatCustomer("Delinquent");
                break;
            
        }

         System.out.println(customer.createMail());              
    }
}
