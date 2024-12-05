package com.veeru.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CaseEventDTO {
    private String eventId;
    private Date createdDate;
}
