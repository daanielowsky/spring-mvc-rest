package com.github.daanielowsky.springmvcrest.bootstrap;

import com.github.daanielowsky.springmvcrest.domain.Customer;
import com.github.daanielowsky.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading customer DATA");

        Customer customer = new Customer();
        customer.setFirstname("Romek");
        customer.setLastname("Atomek");
        customerRepository.save(customer);

        Customer customer1 = new Customer();
        customer1.setFirstname("Alek");
        customer1.setLastname("Bananek");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setFirstname("Zbyszek");
        customer2.setLastname("Stonoga");
        customerRepository.save(customer2);

        System.out.println("Customers Saved: " + customerRepository.count());
    }
}
