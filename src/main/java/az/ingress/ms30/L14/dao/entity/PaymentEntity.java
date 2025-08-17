//package az.ingress.ms30.L14.dao.entity;
//
//import az.ingress.ms30.L14.model.enums.PaymentStatus;
//import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Table(name = "payments")
//@Entity
//@Getter
//@Setter
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode(of = "id")
//public class PaymentEntity {
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Long id;
//  private String transactionId;
//  private Double amount;
//  @Enumerated(EnumType.STRING)
//  private PaymentStatus status;
//}
