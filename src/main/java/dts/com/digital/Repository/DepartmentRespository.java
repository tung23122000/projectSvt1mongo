package dts.com.digital.Repository;

import dts.com.digital.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRespository extends MongoRepository<Department, String> {

}
