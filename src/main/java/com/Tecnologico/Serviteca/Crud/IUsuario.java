package com.Tecnologico.Serviteca.Crud;


import com.Tecnologico.Serviteca.Entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario,Long> {
}

