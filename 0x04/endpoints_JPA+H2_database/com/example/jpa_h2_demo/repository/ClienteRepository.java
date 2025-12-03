package com.example.jpa_h2_demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.jpa_h2_demo.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
