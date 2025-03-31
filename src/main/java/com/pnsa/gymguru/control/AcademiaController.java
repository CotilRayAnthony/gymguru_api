package com.pnsa.gymguru.control;

import com.pnsa.gymguru.model.Academia;
import com.pnsa.gymguru.repository.AcademiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/gymguru/academia")
public class AcademiaController {
    @Autowired
    AcademiaRepository academiaRepository;

    // -- GET
    @GetMapping(value = "/buscar/{codigo}")
    public Optional<Academia> buscarAcademia(@PathVariable int codigo) { return academiaRepository.findById(codigo); }

    @GetMapping(value = "/buscar/todos")
    public List<Academia> buscarTodos() { return academiaRepository.findAll(); }

    // -- POST
    @PostMapping(value = "/cadastrar")
    public void cadastrar(@RequestBody Academia academia) { academiaRepository.save(academia); }

    // -- PUT
    @PutMapping(value = "/editar")
    public void editar(@RequestBody Academia academia) { academiaRepository.save(academia); }

    // -- DELETE
    @DeleteMapping(value = "/excluir/{codigo}")
    public void excluir(@PathVariable int codigo) { academiaRepository.deleteById(codigo); }
}
