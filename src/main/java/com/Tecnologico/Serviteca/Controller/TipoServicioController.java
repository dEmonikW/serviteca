package com.Tecnologico.Serviteca.Controller;

import com.Tecnologico.Serviteca.Entity.TipoServicio;
import com.Tecnologico.Serviteca.Impl.ITipoServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("CRUDTipoServicio")
@CrossOrigin("*")
public class TipoServicioController {

    @Autowired
    private ITipoServicioImpl iTipoServicios;


    @GetMapping
    @RequestMapping(value = "ListarTipoServicios", method = RequestMethod.GET)
    public ResponseEntity<?> ListarTipoServicios() {
        List<TipoServicio> listaTipoServicios = this.iTipoServicios.listarTipoServicios();
        return ResponseEntity.ok(listaTipoServicios);
    }

    @PostMapping
    @RequestMapping(value = "CrearTipoServicios", method = RequestMethod.POST)
    public ResponseEntity<?> CrearTipoServicios(@RequestBody TipoServicio tipoServicio) {
        TipoServicio tipoServicioCreado = this.iTipoServicios.crearTipoServicios(tipoServicio);
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoServicioCreado);
    }

    @PutMapping
    @RequestMapping(value = "ModificarTipoServicios", method = RequestMethod.POST)
    public ResponseEntity<?> ModificarTipoServicios(@RequestBody TipoServicio tipoServicio) {
        TipoServicio tipoServicioModificado = this.iTipoServicios.modificarTipoServicios(tipoServicio);
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoServicioModificado);
    }

    @GetMapping
    @RequestMapping(value = "ConsultarTipoServicios/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarTipoServicios(@PathVariable Long id) {
        TipoServicio tipoServicio = this.iTipoServicios.consultarTipoServicios(id);
        return ResponseEntity.ok(tipoServicio);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarTipoServicios/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarTipoServicios(@PathVariable Long id) {
        this.iTipoServicios.eliminarTipoServicios(id);
        return ResponseEntity.ok().build();
    }
}

