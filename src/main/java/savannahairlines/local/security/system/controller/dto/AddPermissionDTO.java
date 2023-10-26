package savannahairlines.local.security.system.controller.dto;

import jakarta.annotation.Nonnull;
import lombok.Data;

@Data
public class AddPermissionDTO {

    @Nonnull
    private int id;

    @Nonnull
    private int permissionId;
}
