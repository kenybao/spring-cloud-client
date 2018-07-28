package com.domain;

import java.math.BigDecimal;

/**
 * @author 73598.
 * @Date 2018/4/2 0002.
 * @Time 14:49.
 */
public class Account {
    private BigDecimal balance ;
    private Long id;
    private String userId;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        System.out.println(123);;
        return "Account{" +
                "balance=" + balance +
                ", id=" + id +
                ", userId='" + userId + '\'' +
                '}';
    }
}
