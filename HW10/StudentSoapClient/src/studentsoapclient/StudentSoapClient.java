/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsoapclient;

import services.Student;

/**
 *
 * @author praph
 */
public class StudentSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insert(1, "praphat", 3.00);
    }

    private static Student findStudentById(int id) {
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentById(id);
    }

    private static String insert(int id, java.lang.String name, double gpa) {
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.insert(id, name, gpa);
    }

    private static String update(int id, java.lang.String name, double gpa) {
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.update(id, name, gpa);
    }

    private static String delete(int id) {
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.delete(id);
    }
    
    
    
}
