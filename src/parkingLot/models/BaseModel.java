package parkingLot.models;

import java.sql.Time;
import java.util.Date;

public class BaseModel {
    private int id;

    // Audit columns
    private Time CreatedAt;
    private Time UpdatedAt;
    private String createdBy;
    private String updatedBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Time createdAt) {
        CreatedAt = createdAt;
    }

    public Time getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Time updatedAt) {
        UpdatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
