package dts.com.digital.service.impl;


import dts.com.digital.Repository.DepartmentRespository;
import dts.com.digital.entity.Department;
import dts.com.digital.service.DepartmentSevice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentSeviceImpl implements DepartmentSevice {
    private final DepartmentRespository departmentRespository;

    public DepartmentSeviceImpl(
            DepartmentRespository departmentRespository) {this.departmentRespository = departmentRespository;}

    @Override
    public List<Department> fillAllDe() {
        return departmentRespository.findAll();
    }

    @Override
    public Department getOneDe(String id) {
        List<Department> list = departmentRespository.findAll();
        Department department = new Department();
        for (Department dep : list) {
            if (dep.get_id().equals(id)) {
                department = dep;
                break;
            }
        }
        return department;
    }

    @Override
    public void deleteAllDe() {
        departmentRespository.deleteAll();
    }

    @Override
    public void deleteOneDe(String id) {
        List<Department> list = departmentRespository.findAll();
        for (Department dep : list) {
            if (dep.get_id().equals(id)) {
                departmentRespository.delete(dep);
                break;
            }
        }

    }

    @Override
    public void createDe(Department department) {
        departmentRespository.save(department);
    }

    @Override
    public void editDe(String id, Department department) {
        List<Department> list = departmentRespository.findAll();
        for (Department dep : list) {
            if (dep.get_id().equals(id)) {
                departmentRespository.delete(dep);
                departmentRespository.save(department);
                break;
            }
        }
    }


}
//    List<Department> list = departmentRespository.findAll();
//        for(Department dep :list){
//                if()
//                }
//                departmentRespository.saveAndFlush()
//                }