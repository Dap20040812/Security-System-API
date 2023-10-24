package savannahairlines.local.security.system.controller.dto;

import jakarta.annotation.Nonnull;
import lombok.Data;

@Data
public class PermissionDTO {

    @Nonnull
    private String type;

    @Nonnull
    private String name;
}
