
package com.Tecnologico.Serviteca.Controller;


import com.Tecnologico.Serviteca.Entity.Administrador;
import com.Tecnologico.Serviteca.Entity.Cliente;
import com.Tecnologico.Serviteca.Entity.Usuario;
import com.Tecnologico.Serviteca.Impl.IAdministradorImpl;
import com.Tecnologico.Serviteca.Impl.IClienteImpl;
import com.Tecnologico.Serviteca.Impl.IUsuarioImpl;
import com.Tecnologico.Serviteca.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

    @RestController
    @RequestMapping("CRUDAdmin")
    @CrossOrigin("*")
    public class AdministradorController {

        @Autowired
        private IAdministradorImpl iAdministrador;


        @GetMapping
        @RequestMapping(value="ListarAdministrador",method = RequestMethod.GET)
        public ResponseEntity<?> ListarAdministrador(){
            List<Administrador> listaAdministrador=this.iAdministrador.listarAdministrador();
            return ResponseEntity.ok(listaAdministrador);
        }

        @PostMapping
        @RequestMapping(value = "CrearAdministrador",method = RequestMethod.POST)
        public ResponseEntity<?> CrearAdministrador(@RequestBody Administrador administrador){
            Administrador administradorCreado=this.iAdministrador.crearAdministrador(administrador);
            return ResponseEntity.status(HttpStatus.CREATED).body(administradorCreado);
        }
        @PutMapping
        @RequestMapping(value = "ModificarAdministrador",method = RequestMethod.POST)
        public ResponseEntity<?> ModificarAdministrador(@RequestBody Administrador administradorente){
            Administrador administradorModificado=this.iAdministrador.modificarAdministrador(administradorente);
            return ResponseEntity.status(HttpStatus.CREATED).body(administradorModificado);
        }
        @GetMapping
        @RequestMapping(value = "ConsultarAdministrador/{id}",method = RequestMethod.GET)
        public ResponseEntity<?> ConsultarAdministrador(@PathVariable Long id){
            Administrador administrador=this.iAdministrador.consultarAdministrador(id);
            return ResponseEntity.ok(administrador);
        }

        @DeleteMapping
        @RequestMapping(value = "EliminarAdministrador/{id}",method = RequestMethod.DELETE)
        public ResponseEntity<?> EliminarAdministrador(@PathVariable Long id){
            this.iAdministrador.eliminarAdministrador(id);
            return ResponseEntity.ok().build();
        }


    }
