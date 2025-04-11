package org.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_balances")
public class AccountBalance {

    @Id
    @Column(name = "account_id", nullable = false, length = 50)
    private String accountId;

    @Column(name = "user_id", length = 50)
    private String userId;

    @Column(name = "amount", precision = 15, scale = 2)
    private Double amount;

    @Column(name = "dummy_col_4", length = 255)
    private String dummyCol4;

    // Getters and setters
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDummyCol4() {
        return dummyCol4;
    }

    public void setDummyCol4(String dummyCol4) {
        this.dummyCol4 = dummyCol4;
    }
}
