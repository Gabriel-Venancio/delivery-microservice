package com.example.authserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.authserver.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{

    Authority findByName(String name);

}