package com.example.oracle.demo.database.projection;

import com.example.oracle.demo.database.entity.PaymentMethod;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "full", types = { PaymentMethod.class })
public interface PaymentMethodProjectionFull {

    public String getName();
}
