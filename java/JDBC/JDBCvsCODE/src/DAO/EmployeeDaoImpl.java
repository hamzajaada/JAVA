package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import utils.utils;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public List<Employee> findAll() {
        return null;
       
    }

    @Override
    public Employee findById(int id) {
        return null;
       
    }

    @Override
    public void save(Employee employee) {
       Connection con = DBConnection.getConnection();
       if(con == null){
        return;
       }
        //creat Function
        String query = "INSERT INTO employee(name,gender,salary) VALUE (?,?,?)";
        try(PreparedStatement preparedStatement = con.prepareStatement(query);){
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setBoolean(2, employee.getGender());
            // preparedStatement.setDate(3,utils.getSqlDate(employee.getDate()));
            preparedStatement.setDouble(3, employee.getSalary());
            preparedStatement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            try{
                con.close();
            } catch(SQLException es){
                es.printStackTrace();
            }
            
        }
       }
    

    @Override
    public void deleteById(int id) {
       
    }
    
}
