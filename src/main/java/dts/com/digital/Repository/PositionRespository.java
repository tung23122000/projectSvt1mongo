package dts.com.digital.Repository;


import dts.com.digital.entity.Position;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRespository extends MongoRepository<Position,String> {
}
