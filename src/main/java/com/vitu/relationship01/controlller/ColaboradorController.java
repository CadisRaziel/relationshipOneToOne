package com.vitu.relationship01.controlller;

import com.vitu.relationship01.model.Colaborador;
import com.vitu.relationship01.repositories.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @GetMapping("/listar")
    public List<Colaborador> listar(){
        return colaboradorRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Colaborador cadastrar(@RequestBody Colaborador colaborador){
        return colaboradorRepository.save(colaborador);
    }
}
