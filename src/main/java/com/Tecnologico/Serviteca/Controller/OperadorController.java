package com.Tecnologico.Serviteca.Controller;



import com.Tecnologico.Serviteca.Entity.Administrador;
import com.Tecnologico.Serviteca.Entity.Cliente;
import com.Tecnologico.Serviteca.Entity.Operador;
import com.Tecnologico.Serviteca.Entity.Usuario;
import com.Tecnologico.Serviteca.Impl.IAdministradorImpl;
import com.Tecnologico.Serviteca.Impl.IClienteImpl;
import com.Tecnologico.Serviteca.Impl.IOperadorImpl;
import com.Tecnologico.Serviteca.Impl.IUsuarioImpl;
import com.Tecnologico.Serviteca.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("CRUDOperador")
@CrossOrigin("*")
public class OperadorController {

    @Autowired
    private IOperadorImpl iOperador;


    @GetMapping
    @RequestMapping(value="ListarOperador",method = RequestMethod.GET)
    public ResponseEntity<?> ListarOperador(){
        List<Operador> listaOperador=this.iOperador.listarOperador();
        return ResponseEntity.ok(listaOperador);
    }

    @PostMapping
    @RequestMapping(value = "CrearOperador",method = RequestMethod.POST)
    public ResponseEntity<?> CrearOperador(@RequestBody Operador operador){
        Operador operadorCreado=this.iOperador.crearOperador(operador);
        return ResponseEntity.status(HttpStatus.CREATED).body(operadorCreado);
    }
    @PutMapping
    @RequestMapping(value = "ModificarOperador",method = RequestMethod.POST)
    public ResponseEntity<?> ModificarOperador(@RequestBody Operador operador){
        Operador operadorModificado=this.iOperador.modificarOperador(operador);
        return ResponseEntity.status(HttpStatus.CREATED).body(operadorModificado);
    }
    @GetMapping
    @RequestMapping(value = "ConsultarOperador/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarOperador(@PathVariable Long id){
        Operador operador=this.iOperador.consultarOperador(id);
        return ResponseEntity.ok(operador);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarOperador/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarOperador(@PathVariable Long id){
        this.iOperador.eliminarOperador(id);
        return ResponseEntity.ok().build();
    }


}

