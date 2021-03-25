package br.com.realstate.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class DateModel implements Serializable {
    private static final long serialVersionUID = 5296071796628634422L;
    public static final String CREATED_AT = "createdAt";
    @Column(
            nullable = false
    )
    private LocalDateTime createdAt;
    @Column(
            nullable = false
    )
    private LocalDateTime updatedAt;

    public DateModel() {
    }

    public DateModel(LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public DateModel(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

//    public String getFormattedCreatedAt() {
//        return Dates.getFormattedDate(this.createdAt, "yyyy-MM-dd'T'HH:mm:ss");
//    }
//
//    public String getFormattedUpdatedAt() {
//        return Dates.getFormattedDate(this.createdAt, "yyyy-MM-dd'T'HH:mm:ss");
//    }
//
//    public String toString() {
//        return ToStringBuilder.toString(this);
//    }
}