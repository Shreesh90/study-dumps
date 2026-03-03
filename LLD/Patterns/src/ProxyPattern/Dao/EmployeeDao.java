package ProxyPattern.Dao;
import ProxyPattern.EmployeeDo;

public interface EmployeeDao {
    void addEmployee(String client, EmployeeDo obj) throws RuntimeException;
    void deleteEmployee(String client, int employeeId) throws RuntimeException;
    EmployeeDo getEmployee(String client, int employeeId) throws RuntimeException;

}
