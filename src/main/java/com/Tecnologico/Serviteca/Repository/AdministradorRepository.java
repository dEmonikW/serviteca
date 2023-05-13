package com.Tecnologico.Serviteca.Repository;


import com.Tecnologico.Serviteca.Entity.Administrador;
import org.springframework.data.repository.CrudRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
public interface AdministradorRepository extends CrudRepository<Administrador,Long>{

}