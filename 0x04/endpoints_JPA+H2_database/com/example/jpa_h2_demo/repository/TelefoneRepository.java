package com.example.jpa_h2_demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.jpa_h2_demo.model.Telefone;

public interface TelefoneRepository extends CrudRepository<Telefone, Long> {

}
