package com.Tecnologico.Serviteca.Repository;

import com.Tecnologico.Serviteca.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario,Long> {
}
