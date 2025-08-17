//package az.ingress.ms30.L14.service;
//
//import java.util.UUID;
//import az.ingress.ms30.L14.dao.entity.PaymentEntity;
//import az.ingress.ms30.L14.dao.repository.PaymentRepository;
//import az.ingress.ms30.L14.model.dto.request.PaymentRequest;
//import az.ingress.ms30.L14.model.enums.PaymentStatus;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class PaymentService {
//
//  private final PaymentRepository paymentRepository;
//  private final TransactionalPaymentService transactionalPaymentService;
//
//  @Transactional
//  public void startPayment(PaymentRequest request) {
//    var paymentEntity = PaymentEntity.builder()
//            .amount(request.getAmount())
//            .transactionId(UUID.randomUUID().toString())
//            .status(PaymentStatus.INITIAL)
//            .build();
//
//    paymentRepository.save(paymentEntity);
//
//    //in such case see as 1 transaction(if startPayment is Transactional) - in another case see as ordinal method
//    processPayment(paymentEntity);
//
//    // in such case
//    transactionalPaymentService.transactionalPaymentProcess(paymentEntity);
//
//  }
//
//  @Transactional
//  public void processPayment(PaymentEntity paymentEntity) {
//    paymentEntity.setStatus(PaymentStatus.IN_PROCESS);
//    paymentRepository.save(paymentEntity);
//    throw new RuntimeException();
//  }
//
//}
