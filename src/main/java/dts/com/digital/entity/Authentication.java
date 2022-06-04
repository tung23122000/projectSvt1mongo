package dts.com.digital.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("authen")
@Data
public class Authentication {
    @Id
    private String _id;

    private String email;

    private String password;

    private String avatar;

    private Boolean isNew;

    private String roles;

}
