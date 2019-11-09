package com.github.daanielowsky.springmvcrest.repositories;

import com.github.daanielowsky.springmvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
