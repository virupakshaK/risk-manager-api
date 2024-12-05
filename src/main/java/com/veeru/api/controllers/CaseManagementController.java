package com.veeru.api.controllers;

import com.veeru.api.dto.CaseEventDTO;
import com.veeru.api.dto.FilterEventDTO;
import com.veeru.api.services.CaseEventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/casemanagement")
public class CaseManagementController {

    @Autowired
    private CaseEventsService caseEventsService;
    @GetMapping("/test")
    public String test(){
        return "Welcome to CaseManagement";

    }

    @GetMapping("/filterCases")
    public ResponseEntity<List<CaseEventDTO>> fetchEventsByFilters(@RequestBody FilterEventDTO filterEventDTO){

        return new ResponseEntity<>(caseEventsService.filterCaseEvents(filterEventDTO), HttpStatus.OK);
    }
}
