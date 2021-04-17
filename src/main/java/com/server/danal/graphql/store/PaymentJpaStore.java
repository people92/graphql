package com.server.danal.graphql.store;


import com.server.danal.graphql.domain.entity.Payment;
import com.server.danal.graphql.store.jpo.PaymentJpo;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentJpaStore implements PaymentStore{
    private PaymentRepository paymentRepository;

    public PaymentJpaStore(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment findById(int productId) {
        return paymentRepository.findByProductId(productId).toDomain();
    }

    @Override
    public boolean existProductId(int productId) {
        return paymentRepository.existsById(productId);
    }

    @Override
    public Payment savePayment(int productId, String title) {
        Payment payment = new Payment();

        payment.setProductId(productId);
        payment.setTitle(title);

        paymentRepository.save(new PaymentJpo(payment));

        return payment;
    }
}
