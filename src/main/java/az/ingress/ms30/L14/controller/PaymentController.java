package az.ingress.ms30.L14.controller;

import az.ingress.ms30.L14.model.dto.request.PaymentRequest;
import az.ingress.ms30.L14.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {

  private final PaymentService paymentService;

  @PostMapping
  public void pay(@RequestBody PaymentRequest request) {
    paymentService.startPayment(request);
  }

  @GetMapping("/{id}")
  public void getPayment(@PathVariable Long id){
    System.out.println("get payemnt");
  }
}
