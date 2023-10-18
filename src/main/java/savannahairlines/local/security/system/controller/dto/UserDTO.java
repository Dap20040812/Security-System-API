package savannahairlines.local.security.system.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {
    private String firstName;
    private String lastName;
    private String password;
    private String charge;
}
