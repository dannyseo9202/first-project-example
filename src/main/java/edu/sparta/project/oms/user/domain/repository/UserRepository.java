package edu.sparta.project.oms.user.domain.repository;

import edu.sparta.project.oms.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
