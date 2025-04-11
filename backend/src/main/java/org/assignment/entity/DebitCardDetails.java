package org.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "debit_card_details")
public class DebitCardDetail {

    @Id
    @Column(name = "card_id", nullable = false, length = 50)
    private String cardId;

    @Column(name = "user_id", length = 50)
    private String userId;

    @Column(name = "issuer", length = 100)
    private String issuer;

    @Column(name = "number", length = 25)
    private String number;

    @Column(name = "dummy_col_10", length = 255)
    private String dummyCol10;

    // Getters and setters
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDummyCol10() {
        return dummyCol10;
    }

    public void setDummyCol10(String dummyCol10) {
        this.dummyCol10 = dummyCol10;
    }
}
