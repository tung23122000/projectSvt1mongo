package dts.com.digital.Repository;

import dts.com.digital.entity.Authentication;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRespository extends MongoRepository<Authentication,String> {
    @Query("{'email' : ?0}")
    Authentication findByEmail(String email);
}
