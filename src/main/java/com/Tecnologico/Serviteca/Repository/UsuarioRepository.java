package com.Tecnologico.Serviteca.Repository;

import com.Tecnologico.Serviteca.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
    
}
