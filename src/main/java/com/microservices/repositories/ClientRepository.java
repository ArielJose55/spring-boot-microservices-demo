package com.microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.entities.Client;


public interface ClientRepository extends JpaRepository<Client, Long>{
	Client findByNameAndLastName(String name, String lastName);
}
