package com.Tecnologico.Serviteca.Controller;

import com.Tecnologico.Serviteca.Entity.Administrador;
import com.Tecnologico.Serviteca.Entity.Vehiculo;
import com.Tecnologico.Serviteca.Impl.IAdministradorImpl;
import com.Tecnologico.Serviteca.Impl.IVehiculoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDVehiculo")
@CrossOrigin("*")
public class VehiculoController {

    @Autowired
    private IVehiculoImpl iVehiculo;


    @GetMapping
    @RequestMapping(value = "ListarVehiculo", method = RequestMethod.GET)
    public ResponseEntity<?> ListarVehiculo() {
        List<Vehiculo> listaVehiculo = this.iVehiculo.listarVehiculo();
        return ResponseEntity.ok(listaVehiculo);
    }

    @PostMapping
    @RequestMapping(value = "CrearVehiculo", method = RequestMethod.POST)
    public ResponseEntity<?> CrearVehiculo(@RequestBody Vehiculo vehiculo) {
        Vehiculo vehiculoCreado = this.iVehiculo.crearVehiculo(vehiculo);
        return ResponseEntity.status(HttpStatus.CREATED).body(vehiculoCreado);
    }

    @PutMapping
    @RequestMapping(value = "ModificarVehiculo", method = RequestMethod.POST)
    public ResponseEntity<?> ModificarVehiculo(@RequestBody Vehiculo vehiculo) {
        Vehiculo vehiculoModificado = this.iVehiculo.modificarVehiculo(vehiculo);
        return ResponseEntity.status(HttpStatus.CREATED).body(vehiculoModificado);
    }

    @GetMapping
    @RequestMapping(value = "ConsultarVehiculo/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarVehiculo(@PathVariable Long id) {
        Vehiculo vehiculo = this.iVehiculo.consultarVehiculo(id);
        return ResponseEntity.ok(vehiculo);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarVehiculo/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarVehiculo(@PathVariable Long id) {
        this.iVehiculo.eliminarVehiculo(id);
        return ResponseEntity.ok().build();
    }
}
