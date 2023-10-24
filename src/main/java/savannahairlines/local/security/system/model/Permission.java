package savannahairlines.local.security.system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "`PERMISSION`")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String type;

    private String name;

}
