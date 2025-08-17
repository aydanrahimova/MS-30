//package az.ingress.ms30.L14.service;
//
//import az.ingress.ms30.L14.dao.entity.PaymentEntity;
//import az.ingress.ms30.L14.dao.repository.PaymentRepository;
//import az.ingress.ms30.L14.model.enums.PaymentStatus;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class TransactionalPaymentService {
//
//  private final PaymentRepository paymentRepository;
//
//  @Transactional
//  public void transactionalPaymentProcess(PaymentEntity entity){
//    entity.setStatus(PaymentStatus.SUCCESS);
//    paymentRepository.save(entity);
//  }
//
//}
