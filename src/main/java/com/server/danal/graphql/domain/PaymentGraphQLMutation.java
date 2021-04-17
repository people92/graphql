package com.server.danal.graphql.domain;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.server.danal.graphql.domain.entity.Payment;
import com.server.danal.graphql.store.PaymentStore;
import org.springframework.stereotype.Component;

@Component
public class PaymentGraphQLMutation implements GraphQLMutationResolver {

    private PaymentStore paymentStore;

    public PaymentGraphQLMutation(PaymentStore paymentStore){
        this.paymentStore = paymentStore;
    }

    public Payment savePayment(int productId, String title) {
        return paymentStore.savePayment(productId, title);
    }
}
