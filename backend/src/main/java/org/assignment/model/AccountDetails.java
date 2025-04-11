package org.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class AccountDetail {

    @Id
    @Column(name = "account_id", nullable = false, length = 50)
    private String accountId;

    @Column(name = "user_id", length = 50)
    private String userId;

    @Column(name = "color", length = 10)
    private String color;

    @Column(name = "is_main_account")
    private Boolean isMainAccount;

    @Column(name = "progress")
    private Integer progress;

    @Column(name = "dummy_col_5", length = 255)
    private String dummyCol5;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getIsMainAccount() {
        return isMainAccount;
    }

    public void setIsMainAccount(Boolean isMainAccount) {
        this.isMainAccount = isMainAccount;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getDummyCol5() {
        return dummyCol5;
    }

    public void setDummyCol5(String dummyCol5) {
        this.dummyCol5 = dummyCol5;
    }
}
