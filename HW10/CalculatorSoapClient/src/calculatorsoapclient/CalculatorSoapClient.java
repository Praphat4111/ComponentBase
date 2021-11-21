/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorsoapclient;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;

import java.util.*;

/**
 *
 * @author praph
 */
public class CalculatorSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your radius of circle : "); int r = in.nextInt();
        System.out.println("Area of circle : "+area(r));
        System.out.println("Perimeter of circle :"+perimeter(r));
        
    }

    private static double area(int num1) {
        services.CalculatorService_Service service = new services.CalculatorService_Service();
        services.CalculatorService port = service.getCalculatorServicePort();
        return port.area(num1);
    }

    private static double perimeter(int r) {
        services.CalculatorService_Service service = new services.CalculatorService_Service();
        services.CalculatorService port = service.getCalculatorServicePort();
        return port.perimeter(r);
    }
    

  

    

  
  

   

   

   
    
}
