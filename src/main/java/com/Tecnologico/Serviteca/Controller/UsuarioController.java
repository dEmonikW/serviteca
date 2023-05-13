package com.Tecnologico.Serviteca.Controller;


import com.Tecnologico.Serviteca.Entity.Usuario;
import com.Tecnologico.Serviteca.Impl.IUsuarioImpl;
import com.Tecnologico.Serviteca.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("CRUDUsuario")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private IUsuarioImpl iUsuario;


    @GetMapping
    @RequestMapping(value="ListarUsuario",method = RequestMethod.GET)
    public ResponseEntity<?> ListarUsuario(){
        List<Usuario> listaUsuario=this.iUsuario.listarUsuario();
        return ResponseEntity.ok(listaUsuario);
    }

    @PostMapping
    @RequestMapping(value = "CrearUsuario",method = RequestMethod.POST)
    public ResponseEntity<?> CrearUsuario(@RequestBody Usuario usuario){
        Usuario usuarioCreado=this.iUsuario.crearUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCreado);
    }
    @PutMapping
    @RequestMapping(value = "ModificarUsuario",method = RequestMethod.POST)
    public ResponseEntity<?> ModificarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioModificado=this.iUsuario.modificarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioModificado);
    }
    @GetMapping
    @RequestMapping(value = "ConsultarUsuario/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarUsuario(@PathVariable Long id){
        Usuario usuario=this.iUsuario.consultarUsuario(id);
        return ResponseEntity.ok(usuario);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarUsuario/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarUsuario(@PathVariable Long id){
        this.iUsuario.eliminarUsuario(id);
        return ResponseEntity.ok().build();
    }


    /*@GetMapping(value="/ListarUsuario")
    public List<Usuario> getUsuarioList(){
        return usuarioRepository.findAll();

    }
    @PostMapping(value = "/SaveUsuario")
    public ResponseEntity<String> saveUsuario(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.OK).body("{\"message\": \"Usuario guardado con éxito\"}");
    }*/

}
