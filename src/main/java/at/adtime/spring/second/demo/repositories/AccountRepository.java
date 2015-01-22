package at.adtime.spring.second.demo.repositories;

import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import at.adtime.spring.second.demo.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional findByUsername(String username);
}