package az.ingress.ms30.L13.dao.entity;

import static jakarta.persistence.EnumType.STRING;

import java.math.BigDecimal;
import az.ingress.ms30.L13.model.enums.Currency;
import az.ingress.ms30.L13.model.enums.OrderStatus;
import az.ingress.ms30.L13.model.enums.PaymentMethod;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class OrderEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "number", unique = true)
  private String orderNumber;
  @Column(nullable = false)
  private BigDecimal totalAmount;
  @Enumerated(STRING)
  private Currency currency;
  @Enumerated(STRING)
  private OrderStatus status;
  @Enumerated(STRING)
  private PaymentMethod paymentMethod;
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private UserEntity user;

}
