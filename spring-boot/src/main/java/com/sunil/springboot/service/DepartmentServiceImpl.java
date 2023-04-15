package com.sunil.springboot.service;

import com.sunil.springboot.entity.Department;
import com.sunil.springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
       return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long deptId) {
       return departmentRepository.findById(deptId).get();
    }

    @Override
    public void deleteDeptById(Long deptId) {
        departmentRepository.deleteById(deptId);
    }

    @Override
    public Department updateDepartment(Long deptId, Department department) {

        Department deptDB = departmentRepository.findById(deptId).get();

        if (Objects.nonNull(department.getDeptName()) && !"".equalsIgnoreCase(department.getDeptName())) {
            deptDB.setDeptName(department.getDeptName());
        }
        if (Objects.nonNull(department.getDeptAddress()) && !"".equalsIgnoreCase(department.getDeptAddress())) {
            deptDB.setDeptAddress(department.getDeptAddress());
        }
        if (Objects.nonNull(department.getDeptCode()) && !"".equalsIgnoreCase(department.getDeptCode())) {
            deptDB.setDeptCode(department.getDeptCode());
        }
        return departmentRepository.save(deptDB);
    }
}
