package org.assignment.repository;

import org.assignment.model.AccountFlags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountFlagRepository extends JpaRepository<AccountFlag, Integer> {
}
