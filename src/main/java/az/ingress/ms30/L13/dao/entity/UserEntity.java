package az.ingress.ms30.L13.dao.entity;

import static jakarta.persistence.CascadeType.MERGE;
import static jakarta.persistence.CascadeType.PERSIST;
import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

import java.util.List;
import az.ingress.ms30.L13.model.enums.UserStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class UserEntity {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  @Column(name = "name")
  private String firstName;
  @Column(name = "surname")
  private String lastName;
  @Column(nullable = false, unique = true)
  private String email;
  @Column(nullable = false, unique = true)
  private String username;
  private String password;
  @Enumerated(STRING)
  private UserStatus status;
  @OneToMany(cascade = {PERSIST, MERGE}, mappedBy = "user")
  private List<OrderEntity> orders;

}
