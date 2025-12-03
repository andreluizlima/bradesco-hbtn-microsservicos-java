package com.example.jpa_h2_demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.jpa_h2_demo.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, Long>{

}
