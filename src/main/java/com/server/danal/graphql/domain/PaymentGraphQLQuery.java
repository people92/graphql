package com.server.danal.graphql.domain;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.server.danal.graphql.domain.entity.Payment;
import com.server.danal.graphql.store.PaymentStore;
import org.springframework.stereotype.Component;

@Component
public class PaymentGraphQLQuery implements GraphQLQueryResolver {

    private PaymentStore paymentStore;

    public PaymentGraphQLQuery(PaymentStore paymentStore) {
        this.paymentStore = paymentStore;
    }

    public Payment getPaymentByProductId(int productId) {
        return paymentStore.findById(productId);
    }
    public boolean isExistenceProductId(int productId) {
        return paymentStore.existProductId(productId);
    }
}
