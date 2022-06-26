package io.jagdesh.crud.service;

import io.jagdesh.crud.entity.Employee;
import io.jagdesh.crud.exception.EmployeeNotFoundException;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public Employee saveAnEmployee(Employee emp);

    public List<Employee> getAllEmployees();

    public Optional<Employee> getAnEmployeeById(Long empId) throws EmployeeNotFoundException;

    public Employee updateAnEmployee(Long empId, Employee emp);

    public void deleteEmployeeById(Long empId);
}
