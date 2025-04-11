package org.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @Column(name = "transaction_id", nullable = false, length = 50)
    private String transactionId;

    @Column(name = "user_id", length = 50)
    private String userId;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "image", length = 255)
    private String image;

    @Column(name = "isBank")
    private Boolean isBank;

    @Column(name = "dummy_col_6", length = 255)
    private String dummyCol6;

    // Getters and setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getIsBank() {
        return isBank;
    }

    public void setIsBank(Boolean isBank) {
        this.isBank = isBank;
    }

    public String getDummyCol6() {
        return dummyCol6;
    }

    public void setDummyCol6(String dummyCol6) {
        this.dummyCol6 = dummyCol6;
    }
}
