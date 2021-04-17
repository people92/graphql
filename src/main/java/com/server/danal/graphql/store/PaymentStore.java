package com.server.danal.graphql.store;

import com.server.danal.graphql.domain.entity.Payment;

public interface PaymentStore {

    Payment findById(int productId);

    boolean existProductId(int productId);

    Payment savePayment(int productId, String title);
}
