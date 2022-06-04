package dts.com.digital.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("position")
@Data

public class Position {

    @Id
    private  String _id;

    private  String title;

}
