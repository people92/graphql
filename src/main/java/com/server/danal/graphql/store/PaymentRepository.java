package com.server.danal.graphql.store;

import com.server.danal.graphql.store.jpo.PaymentJpo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentJpo, Integer> {

    PaymentJpo findByProductId(int productId);
}
