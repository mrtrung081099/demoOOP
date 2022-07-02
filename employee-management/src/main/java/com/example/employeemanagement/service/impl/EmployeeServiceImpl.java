package com.example.employeemanagement.service.impl;

import com.example.employeemanagement.entity.EmployeeEntity;
import com.example.employeemanagement.repository.EmployeeRepository;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository _employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this._employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return _employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> finById(Long id) {
        return _employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return _employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return _employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        _employeeRepository.deleteById(id);
    }
}
