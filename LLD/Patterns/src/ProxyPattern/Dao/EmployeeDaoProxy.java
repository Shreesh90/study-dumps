package ProxyPattern.Dao;

import ProxyPattern.Dao.EmployeeDao;
import ProxyPattern.Dao.EmployeeDaoImpl;
import ProxyPattern.EmployeeDo;

import java.util.Objects;

public class EmployeeDaoProxy implements EmployeeDao {
    EmployeeDaoImpl employeeDaoImpl;

    public EmployeeDaoProxy() {
        employeeDaoImpl = new EmployeeDaoImpl();
    }

    @Override
    public void addEmployee(String client, EmployeeDo obj) {
        if(client.equals("admin")) {
            employeeDaoImpl.addEmployee(client, obj);
        }
        else throw new RuntimeException("Unauthorized access. Only admin can add employee.");
    }

    @Override
    public void deleteEmployee(String client, int employeeId) {
        if(client.equals("admin")) {
            employeeDaoImpl.deleteEmployee(client, employeeId);
        }
        else throw new RuntimeException("Unauthorized access. Only admin can delete employee.");
    }

    @Override
    public EmployeeDo getEmployee(String client, int employeeId) {
        if(Objects.equals(client, "admin") || Objects.equals(client, "user")) {
            return employeeDaoImpl.getEmployee(client, employeeId);
        }
        throw new RuntimeException("Unauthorized access. Only admin can get employee details.");
    }

}
