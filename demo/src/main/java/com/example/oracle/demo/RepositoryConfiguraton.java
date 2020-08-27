package com.example.oracle.demo;

import com.example.oracle.demo.database.entity.Payment;
import com.example.oracle.demo.database.entity.PaymentMethod;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfiguraton extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		super.configureRepositoryRestConfiguration(config);
        config.exposeIdsFor(Payment.class);
        config.exposeIdsFor(PaymentMethod.class);

        config.setReturnBodyOnCreate(true);
	}
}
