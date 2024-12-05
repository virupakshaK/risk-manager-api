package com.veeru.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public class FilterEventDTO {

    private Date fromDate;
    private Date toDate;
    private String userId;
    private String resolution;
    private String tag;
    private String ip;

}
