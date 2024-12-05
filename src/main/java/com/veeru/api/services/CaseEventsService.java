package com.veeru.api.services;

import com.veeru.api.dto.CaseEventDTO;
import com.veeru.api.dto.FilterEventDTO;
import com.veeru.api.repositories.CaseEventsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CaseEventsService {

    private CaseEventsRepository caseEventsRepository;

    public List<CaseEventDTO> filterCaseEvents(FilterEventDTO filterEventDTO){
       // caseEventsRepository
        return null;
    }
}
