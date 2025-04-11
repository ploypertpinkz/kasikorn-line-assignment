package org.assignment.repository;

import org.assignment.model.DebitCardDesign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardDesignRepository extends JpaRepository<DebitCardDesign, String> {
}
