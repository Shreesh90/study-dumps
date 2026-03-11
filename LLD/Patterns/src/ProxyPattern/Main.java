package ProxyPattern;

import ProxyPattern.Dao.EmployeeDao;
import ProxyPattern.Dao.EmployeeDaoProxy;
import ProxyPattern.EmployeeDo;

public class Main {
    public static void main(String[] args) {
        try {

            EmployeeDao employeeDao = new EmployeeDaoProxy();

            // Admin client
            employeeDao.addEmployee("admin", new EmployeeDo());
            employeeDao.deleteEmployee("admin", 1);
            employeeDao.getEmployee("admin", 1);

            // User client
            employeeDao.getEmployee("user", 1);

            // Unauthorized client
             employeeDao.addEmployee("guest", new EmployeeDo());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
