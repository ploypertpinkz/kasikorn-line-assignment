package org.assignment.repository;

import org.assignment.model.DebitCardStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardStatusRepository extends JpaRepository<DebitCardStatus, String> {
}
