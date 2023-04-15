package com.sunil.springboot.service;

import com.sunil.springboot.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long deptId);

    void deleteDeptById(Long deptId);

    Department updateDepartment(Long deptId, Department department);
}
