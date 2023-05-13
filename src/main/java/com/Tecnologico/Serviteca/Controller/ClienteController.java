package com.Tecnologico.Serviteca.Controller;


import com.Tecnologico.Serviteca.Entity.Cliente;
import com.Tecnologico.Serviteca.Entity.Usuario;
import com.Tecnologico.Serviteca.Impl.IClienteImpl;
import com.Tecnologico.Serviteca.Impl.IUsuarioImpl;
import com.Tecnologico.Serviteca.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("CRUDCliente")
@CrossOrigin("*")
public class ClienteController {

    @Autowired
    private IClienteImpl iCliente;


    @GetMapping
    @RequestMapping(value="ListarCliente",method = RequestMethod.GET)
    public ResponseEntity<?> ListarCliente(){
        List<Cliente> listaCliente=this.iCliente.listarCliente();
        return ResponseEntity.ok(listaCliente);
    }

    @PostMapping
    @RequestMapping(value = "CrearCliente",method = RequestMethod.POST)
    public ResponseEntity<?> CrearCliente(@RequestBody Cliente cliente){
        Cliente clienteCreado=this.iCliente.crearCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteCreado);
    }
    @PutMapping
    @RequestMapping(value = "ModificarCliente",method = RequestMethod.POST)
    public ResponseEntity<?> ModificarCliente(@RequestBody Cliente cliente){
        Cliente clienteModificado=this.iCliente.modificarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteModificado);
    }
    @GetMapping
    @RequestMapping(value = "ConsultarCliente/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarCliente(@PathVariable Long id){
        Cliente cliente=this.iCliente.consultarCliente(id);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarCliente/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarCliente(@PathVariable Long id){
        this.iCliente.eliminarCliente(id);
        return ResponseEntity.ok().build();
    }


}
