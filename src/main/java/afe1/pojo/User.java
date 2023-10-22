package afe1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private Integer customer_id;
    private String first_name;
    private String last_name;
    private Date brith_date;
    private String phone;
    private String address;
    private String city;
    private String state;
    private Integer points;
}
