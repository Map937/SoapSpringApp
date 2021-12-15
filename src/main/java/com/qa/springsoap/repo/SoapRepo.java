package com.qa.springsoap.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.springsoap.domain.Soap;

public interface SoapRepo extends JpaRepository<Soap, Long> {

}
