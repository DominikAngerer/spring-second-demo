package at.adtime.spring.second.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import at.adtime.spring.second.demo.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}