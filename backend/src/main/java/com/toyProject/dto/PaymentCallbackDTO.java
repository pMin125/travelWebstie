package com.toyProject.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaymentCallbackDTO {
    private String paymentUid; // 결제 고유 번호
    private String orderUid; // 주문 고유 번호
}
