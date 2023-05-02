package com.example.demo.repository;

import com.example.demo.model.Account;
import com.example.demo.model.Customer2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
    @Override
    public List<Account> findAll();

    @Override
    public Account  save(Account accobj);

    @Override
    public void deleteAll();
}
