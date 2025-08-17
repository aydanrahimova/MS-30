//package az.ingress.ms30.L13.dao.entity;
//
//import static jakarta.persistence.EnumType.STRING;
//import static jakarta.persistence.FetchType.LAZY;
//import static jakarta.persistence.GenerationType.IDENTITY;
//
//import java.math.BigDecimal;
//import az.ingress.ms30.L13.model.enums.Currency;
//import az.ingress.ms30.L13.model.enums.OrderStatus;
//import az.ingress.ms30.L13.model.enums.PaymentMethod;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Table(name = "orders")
//@Getter
//@Setter
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode(of = "id")
//public class OrderEntity {
//  @Id
//  @GeneratedValue(strategy = IDENTITY)
//  private Long id;
//  @Column(name = "number", unique = true)
//  private String orderNumber;
//  private BigDecimal totalAmount;
//  @Enumerated(STRING)
//  private Currency currency;
//  @Enumerated(STRING)
//  private OrderStatus status;
//  @Enumerated(STRING)
//  private PaymentMethod paymentMethod;
//  @ManyToOne(fetch = LAZY)
//  @JoinColumn(name = "user_id")
//  private UserEntity user;
//
//}
