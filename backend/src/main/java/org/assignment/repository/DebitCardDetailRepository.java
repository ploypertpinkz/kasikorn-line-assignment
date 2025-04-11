package org.assignment.repository;

import org.assignment.model.DebitCardDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardDetailRepository extends JpaRepository<DebitCardDetail, String> {
}
