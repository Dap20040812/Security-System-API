package savannahairlines.local.security.system.controller.dto;

import jakarta.annotation.Nonnull;
import lombok.Data;

@Data
public class AreaDTO {

    @Nonnull
    private String name;

    @Nonnull
    private String description;
}
