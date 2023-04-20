package com.sunil.springboot.repository;

import com.sunil.springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String deptName);

    public Department findByDepartmentNameIgnoreCase(String deptName);
}
