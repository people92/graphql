--
-- 회원
--
DROP TABLE IF EXISTS PAYMENT;

CREATE TABLE PAYMENT COMMENT '투자' (
    PRODUCT_ID                  NUMBER(13)     NOT NULL     COMMENT '상품ID'
  , TITLE                       VARCHAR(100)                COMMENT '상품명'
  , TOTAL_INVESTING_AMOUNT      NUMBER(13)                  COMMENT '총 투자 모집금액'
  , CURRENT_INVESTING_AMOUNT    NUMBER(13)                  COMMENT '누적 투자 모집금액'
  , INVESTER_CNT                NUMBER(10)                  COMMENT '투자자 수'
  , STARTED_AT                  TIMESTAMP                   COMMENT '투자시작일시'
  , FINISHED_AT                 TIMESTAMP                   COMMENT '투자종료일시'
  , INVESTMENT_STATUS           VARCHAR(3)                  COMMENT '투자모집상태'
  , PRIMARY KEY (PRODUCT_ID)
);




