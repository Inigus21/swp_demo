package com.explorevietnam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.explorevietnam.entity.Account;
import com.explorevietnam.repository.AccountRepository;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account handleAccount(Account newAccount) {
        Account account = this.accountRepository.save(newAccount);
        return account;
    }

    public Account getAccountById(long id) {
        return this.accountRepository.findById(id);
    }

    public List<Account> getAllAccounts() {
        return this.accountRepository.findAll();
    }

    public void deleteAccount(long id) {
        this.accountRepository.deleteById(id);
    }
}
