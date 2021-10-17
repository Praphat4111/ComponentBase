/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentJDBC;

import java.sql.SQLException;
import java.util.ArrayList;
import utilities.DatabaseDriver;
import utilities.DatabaseHandler;

/**
 *
 * @author user
 */
public class StudentDatabaseWithDBClass {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/Student";
        String user = "app";
        String passwd = "app";
      
        DatabaseDriver dbDriver = new DatabaseDriver(driver, url, user, passwd);
        
        DatabaseHandler dbHandler = new DatabaseHandler(dbDriver);
        
        Student std1 = new Student(1, "Praphat", 3.0);
        
        
        StudentTable.insertStudent(dbHandler, std1);
       

        ArrayList<Student> StudentList = StudentTable.findAllStudent(dbHandler);
        if (StudentList != null) {
            printAllEmployee(StudentList);
        }
        dbHandler.closeConnection();
    }
    
    public static void printAllEmployee(ArrayList<Student> sdtList) {
        for(int i = 0; i < sdtList.size(); i++) {
            System.out.print(sdtList.get(i).getId() + " ");
            System.out.print(sdtList.get(i).getName() + " ");
            System.out.println(sdtList.get(i).getGPA() + " ");
        }
        
    }
}
