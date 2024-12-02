package ua.edu.ucu.apps.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class FacebookUser {
        
    private String email;
    private String userCountry;
    private String userActiveTime;

}
