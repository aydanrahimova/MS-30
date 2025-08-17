package az.ingress.ms30.L14.model.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentRequest {
  private Double amount;
}
