/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.DatabaseHandler;

/**
 *
 * @author sarun
 */
public class StudentTable {
    public static int updateStudent(DatabaseHandler dbHandler, Student std) {
        String sql = "update student set Name=?, GPA=? where Id=?";
        int rowUpdated;
        try {
            rowUpdated = dbHandler.update(sql, std.getName(), std.getGPA(), std.getId());
        }
        catch (SQLException ex ) {
            
            rowUpdated = 0;
        }
        
        return rowUpdated;
    }
     public static int removeStudent(DatabaseHandler dbHandler, Student std) {
         String sql ="delete from student where Id = ?";
         
         int rowDeleted;
         try {
            rowDeleted = dbHandler.update(sql, std.getId());
         }
         catch (SQLException ex ) {
             rowDeleted = 0;
         }
        return rowDeleted;
    }
    public static int insertStudent(DatabaseHandler dbHandler, Student std) {
         String sql = "insert into student (Id, Name, GPA)" + 
               " values (?,?,?)";
         
         int rowInserted;
         try {
             rowInserted = dbHandler.update(sql, std.getId(), std.getName(), std.getGPA());
         }
         catch(SQLException ex ) {
             rowInserted = 0;
         }
         return rowInserted;
    } 

//     public static Student findStudentById(DatabaseHandler dbHandler, int id) throws SQLException {
//        String sql = "select * from student where ID = ?";
//        ResultSet rs;
//        Student std = null;
//        rs = dbHandler.query(sql, id);
//        if (rs.next()) {
//           std = new Student();
//           std.setId(rs.getInt("id"));
//           std.setName(rs.getString("name"));
//           std.setGPA(rs.getDouble("GPA"));
//       }
//        return std;
//        
//    }
//     
//    public static ArrayList<Student> findStudentByName(DatabaseHandler dbHandler, String name) throws SQLException {
//        String sql = "select * from student where NAME = ?";
//        ResultSet rs;
//        ArrayList<Student> stdList = null;
//        rs = dbHandler.query(sql, name);
//        stdList = extractStudent(rs);
//        return stdList;
//        
//    } 
    public static ArrayList<Student> findAllStudent(DatabaseHandler dbHandler) throws SQLException {
        String sql = "select * from student order by ID";
        ResultSet rs; 
        ArrayList<Student> stdList = null;
        rs = dbHandler.query(sql);
        stdList = extractStudent(rs);
        return stdList;
    }
    private static ArrayList<Student> extractStudent(ResultSet rs) {
        ArrayList<Student> stdList = new ArrayList<>();
        try {
            while(rs.next()) {
                Student student = new Student();
                try {
                    student.setId(rs.getInt("id"));
                    student.setName(rs.getString("name"));
                    student.setGPA(rs.getDouble("GPA"));
                } catch (SQLException ex) {
                    Logger.getLogger(StudentTable.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                stdList.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(stdList.size() == 0) {
            stdList = null;
        }
        return stdList;
    }
}

