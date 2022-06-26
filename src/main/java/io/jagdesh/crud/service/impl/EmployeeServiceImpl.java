package io.jagdesh.crud.service.impl;

import io.jagdesh.crud.entity.Employee;
import io.jagdesh.crud.exception.EmployeeNotFoundException;
import io.jagdesh.crud.repository.EmployeeRepository;
import io.jagdesh.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;
    @Override
    public Employee saveAnEmployee(Employee emp) {
        return empRepo.save(emp);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    @Override
    public Optional<Employee> getAnEmployeeById(Long empId) throws EmployeeNotFoundException {
        Optional<Employee> employee = Optional.ofNullable(empRepo.findById(empId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee is not Available")));
        return employee;
    }

    @Override
    public Employee updateAnEmployee(Long empId, Employee emp) {

        Employee empDB = empRepo.findById(empId).get();

        if (Objects.nonNull(emp.getEmployeeName()) && !"".equalsIgnoreCase(emp.getEmployeeName())) {
            empDB.setEmployeeName(emp.getEmployeeName());
        }
        if (Objects.nonNull(emp.getEmployeeAddress()) && !"".equalsIgnoreCase(emp.getEmployeeAddress())) {
            empDB.setEmployeeAddress(emp.getEmployeeAddress());
        }
        if (Objects.nonNull(emp.getEmployeeCode()) && !"".equalsIgnoreCase(emp.getEmployeeCode())) {
            empDB.setEmployeeCode(emp.getEmployeeCode());
        }
        return empRepo.save(empDB);
    }

    @Override
    public void deleteEmployeeById(Long empId) {
        empRepo.deleteById(empId);
    }
}
