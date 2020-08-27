package com.example.oracle.demo.database.projection;

import com.example.oracle.demo.database.entity.Payment;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "full", types = { Payment.class })
public interface PaymentProjectionFull {

    public Long getResourceId();
    public String getName();
    public PaymentMethodProjectionFull getPaymentMethod();
}
