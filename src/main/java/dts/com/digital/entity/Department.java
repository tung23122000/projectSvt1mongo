package dts.com.digital.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document("department")
@Data

public class Department {
    @Id
    private String _id;

    private String slug;

    private String parent;

    private String name;



}
