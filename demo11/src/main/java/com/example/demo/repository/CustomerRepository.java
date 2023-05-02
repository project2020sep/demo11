package com.example.demo.repository;

import com.example.demo.model.Customer2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer2,Integer> {
    @Override
    List<Customer2> findAll();

    @Override
    Customer2  save(Customer2 custobj);

    @Override
    void deleteAll();
}
