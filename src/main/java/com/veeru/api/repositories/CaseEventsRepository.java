package com.veeru.api.repositories;

import com.veeru.api.entities.CaseEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseEventsRepository extends JpaRepository<CaseEvent, String> {
}
