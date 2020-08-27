package com.example.oracle.demo.database.repository;

import com.example.oracle.demo.database.entity.PaymentMethod;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "paymentMethod", path = "paymentMethod")
public interface PaymentMethodRepository extends PagingAndSortingRepository<PaymentMethod, Long> {
}
