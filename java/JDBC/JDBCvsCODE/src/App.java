import java.util.Date;

import DAO.Employee;
import DAO.EmployeeDao;
import DAO.EmployeeDaoImpl;

public class App {
    public static void main(String[] args) throws Exception {
       EmployeeDao  employeeDao = new  EmployeeDaoImpl();
       Employee employee = new Employee(0, "hamza", true,  3000);
       Employee employee1 = new Employee(0, "hamza", true,  3000);
       employeeDao.save(employee);
       employeeDao.save(employee1);
    }
}
