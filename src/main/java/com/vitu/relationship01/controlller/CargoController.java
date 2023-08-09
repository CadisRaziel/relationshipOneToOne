package com.vitu.relationship01.controlller;

import com.vitu.relationship01.model.Cargo;
import com.vitu.relationship01.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoController {
    @Autowired
    private CargoRepository cargoRepository;

    @GetMapping("/listar")
    public List<Cargo> listar (){
        return cargoRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Cargo cadastrar(@RequestBody Cargo cargo){
        return cargoRepository.save(cargo);
    }
}
