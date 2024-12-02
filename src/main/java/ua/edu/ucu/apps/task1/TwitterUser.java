package ua.edu.ucu.apps.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class TwitterUser {
    
    private String userMail;
    private String country;
    private String lastActiveTime;

}
