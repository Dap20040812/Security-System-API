package savannahairlines.local.security.system.controller.dto;

import jakarta.annotation.Nonnull;
import lombok.Data;

@Data
public class UserDTO {

    @Nonnull
    private String firstName;

    @Nonnull
    private String lastName;

    @Nonnull
    private String password;

    @Nonnull
    private String email;

    @Nonnull
    private String charge;
}
