package com.spring.java_spring.Interface;

import com.spring.java_spring.Model.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepositor extends CrudRepository<Pessoa, Integer> {

}
