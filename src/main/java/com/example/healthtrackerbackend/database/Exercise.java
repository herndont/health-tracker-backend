package com.example.healthtrackerbackend.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Exercise {
    @Id
    @GeneratedValue
    private long id;

    private String title;
    private int quantity;
    private String description;
    private Date performedDate;


//    Not sure if I am going to need to map these (one to many) (many to one) type thing

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPerformedDate() {
        return performedDate;
    }

    public void setPerformedDate(Date performedDate) {
        this.performedDate = performedDate;
    }
}
