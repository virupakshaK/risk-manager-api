package com.veeru.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class CaseEvent {

    @Id
    private String eventId;
    private Date createdDate;

}
