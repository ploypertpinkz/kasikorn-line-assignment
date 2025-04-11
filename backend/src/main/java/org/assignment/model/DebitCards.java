package org.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "debit_cards")
public class DebitCard {

    @Id
    @Column(name = "card_id", nullable = false, length = 50)
    private String cardId;

    @Column(name = "user_id", length = 50)
    private String userId;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "dummy_col_7", length = 255)
    private String dummyCol7;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDummyCol7() {
        return dummyCol7;
    }

    public void setDummyCol7(String dummyCol7) {
        this.dummyCol7 = dummyCol7;
    }
}
