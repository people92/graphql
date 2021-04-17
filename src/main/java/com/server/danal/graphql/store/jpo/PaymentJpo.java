package com.server.danal.graphql.store.jpo;

import com.server.danal.graphql.domain.entity.Payment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "PAYMENT")
@NoArgsConstructor
@Getter
@Setter
public class PaymentJpo {
    @Id
    @Column(name = "PRODUCT_ID")
    private int productId; //상품ID

    @Column(name = "TITLE")
    private String title; //상품명

    @Column(name = "TOTAL_INVESTING_AMOUNT")
    private int totalInvestingAmount; //총 투자 모집금액

    @Column(name = "CURRENT_INVESTING_AMOUNT")
    private int currentInvestingAmount; //누적 투자 모집금액

    @Column(name = "INVESTER_CNT")
    private int investerCnt; //투자자 수

    @Column(name = "STARTED_AT")
    private Timestamp startedAt; //투자시작일시

    @Column(name = "FINISHED_AT")
    private Timestamp finishedAt; //투자종료일시

    @Column(name = "INVESTMENT_STATUS")
    private String investmentStatus; //투자모집상태

    public PaymentJpo(Payment payment){
        BeanUtils.copyProperties(payment, this);
    }

    public Payment toDomain() {
        Payment payment = new Payment();
        BeanUtils.copyProperties(this, payment);
        return payment;
    }

}
