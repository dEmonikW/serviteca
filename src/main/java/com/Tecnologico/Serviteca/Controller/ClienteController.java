package com.Tecnologico.Serviteca.Controller;

import com.Tecnologico.Serviteca.Entity.Cliente;
import com.Tecnologico.Serviteca.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ClienteController {


    @Autowired
    private ClienteRepository clienteRepository;


    public <S extends Cliente> S save(S entity) {
        return clienteRepository.save(entity);
    }


    public <S extends Cliente> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @GetMapping(value="/ListarClientes")
    public Optional<Cliente> findById(Long aLong) {
        return Optional.empty();
    }


    public boolean existsById(Long aLong) {
        return false;
    }

    public Iterable<Cliente> findAll() {
        return null;
    }


    public Iterable<Cliente> findAllById(Iterable<Long> longs) {
        return null;
    }


    public long count() {
        return 0;
    }

    public void deleteById(Long aLong) {

    }

    public void delete(Cliente entity) {

    }


    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    public void deleteAll(Iterable<? extends Cliente> entities) {

    }

    public void deleteAll() {

    }
}

