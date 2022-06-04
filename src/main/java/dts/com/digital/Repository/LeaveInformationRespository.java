package dts.com.digital.Repository;

import dts.com.digital.entity.LeaveInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveInformationRespository extends MongoRepository<LeaveInformation,String> {
}
