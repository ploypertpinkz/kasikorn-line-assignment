package org.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "debit_card_design")
public class DebitCardDesign {

    @Id
    @Column(name = "card_id", nullable = false, length = 50)
    private String cardId;

    @Column(name = "user_id", length = 50)
    private String userId;

    @Column(name = "color", length = 10)
    private String color;

    @Column(name = "border_color", length = 10)
    private String borderColor;

    @Column(name = "dummy_col_9", length = 255)
    private String dummyCol9;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getDummyCol9() {
        return dummyCol9;
    }

    public void setDummyCol9(String dummyCol9) {
        this.dummyCol9 = dummyCol9;
    }
}
