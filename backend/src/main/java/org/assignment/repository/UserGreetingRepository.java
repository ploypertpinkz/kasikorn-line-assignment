package org.assignment.repository;

import org.assignment.model.UserGreetings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGreetingRepository extends JpaRepository<UserGreeting, String> {
}
