package org.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_greetings")
public class UserGreeting {

    @Id
    @Column(name = "user_id", nullable = false, length = 50)
    private String userId;

    @Column(name = "greeting", columnDefinition = "TEXT")
    private String greeting;

    @Column(name = "dummy_col_2", length = 255)
    private String dummyCol2;

    // Getters and setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getDummyCol2() {
        return dummyCol2;
    }

    public void setDummyCol2(String dummyCol2) {
        this.dummyCol2 = dummyCol2;
    }
}
