package com.explorevietnam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.explorevietnam.entity.Account;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account save(Account newAccount);

    Account findById(long id);

    List<Account> findAll();
}
