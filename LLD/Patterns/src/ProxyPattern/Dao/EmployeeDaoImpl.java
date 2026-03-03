package ProxyPattern.Dao;
import ProxyPattern.Dao.EmployeeDao;
import ProxyPattern.EmployeeDo;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void addEmployee(String client, EmployeeDo obj) {
        System.out.println("Adding employee for client: " + client);
    }

    @Override
    public void deleteEmployee(String client, int employeeId) {
        System.out.println("Deleting employee for client: " + client + ", employeeId: " + employeeId);
    }

    @Override
    public EmployeeDo getEmployee(String client, int employeeId) {
        System.out.println("Getting employee for client: " + client + ", employeeId: " + employeeId);
        return new EmployeeDo();
    }
}
