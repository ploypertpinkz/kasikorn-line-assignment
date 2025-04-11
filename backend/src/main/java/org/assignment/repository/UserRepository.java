package org.assignment.repository;

import org.assignment.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    @Query("SELECT u FROM Users u WHERE u.userId = :id")
    Optional<User> getUserById(@Param("id") String id);
}
