package com.Tecnologico.Serviteca.Repository;

import com.Tecnologico.Serviteca.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
public interface ClienteRepository extends CrudRepository<Cliente,Long> {


}