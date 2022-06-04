package dts.com.digital.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document( "leaveInformation")
public class LeaveInformation {
    @Id
    private String Code;

    private Date date;

}
