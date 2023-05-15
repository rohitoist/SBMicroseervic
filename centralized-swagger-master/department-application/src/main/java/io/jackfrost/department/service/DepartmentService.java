package io.jackfrost.department.service;

import io.jackfrost.department.entity.DepartmentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

    public List<DepartmentEntity> getAllDepartments(){
        List<DepartmentEntity> departments = new ArrayList<>();
        DepartmentEntity scienceDept = DepartmentEntity.builder().departmentId("1").departmentName("Science").build();
        DepartmentEntity commerceDept = DepartmentEntity.builder().departmentName("Commerce").departmentId("2").build();
        DepartmentEntity artsDept = DepartmentEntity.builder().departmentId("3").departmentName("Arts").build();
        departments.add(scienceDept);
        departments.add(commerceDept);
        departments.add(artsDept);
        return departments;
    }
}
