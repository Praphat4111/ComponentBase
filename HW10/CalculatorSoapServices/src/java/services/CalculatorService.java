/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author praph
 */
@WebService(serviceName = "CalculatorService")
public class CalculatorService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "area")
    public double area(@WebParam(name = "num1") int num1) {
        return 3.14*num1*num1;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "perimeter")
    public double perimeter(@WebParam(name = "r") int r) {
        return 2*3.14*r;
    }

    /**
     * This is a sample web service operation
     */
 
}
