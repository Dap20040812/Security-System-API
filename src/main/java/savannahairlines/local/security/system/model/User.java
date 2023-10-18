package savannahairlines.local.security.system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "`USER`")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    private String Password;

    private String charge;

    @ManyToMany
    @JoinTable(
            name = "USER_PERMISSION",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "permissionId")
    )
    private List<Permission> permissions;

    public User(String firstName, String lastName, String password, String charge) {
        this.firstName = firstName;
        this.lastName = lastName;
        Password = password;
        this.charge = charge;
    }
}
