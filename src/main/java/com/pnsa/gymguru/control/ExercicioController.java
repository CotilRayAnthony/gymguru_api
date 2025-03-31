package com.pnsa.gymguru.control;

import com.pnsa.gymguru.model.Exercicio;
import com.pnsa.gymguru.repository.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/gymguru/exercicio")
public class ExercicioController {
    @Autowired
    ExercicioRepository exercicioRepository;

    // -- GET
    @GetMapping(value = "/buscar/{codigo}")
    public Optional<Exercicio> buscarExercicio(@PathVariable int codigo) { return exercicioRepository.findById(codigo); }

    @GetMapping(value = "/buscar/todos")
    public List<Exercicio> buscarTodos() { return exercicioRepository.findAll(); }

    // -- POST
    @PostMapping(value = "/cadastrar")
    public void cadastrar(@RequestBody Exercicio exercicio) { exercicioRepository.save(exercicio); }

    // -- PUT
    @PutMapping(value = "/editar")
    public void editar(@RequestBody Exercicio exercicio) { exercicioRepository.save(exercicio); }

    // -- DELETE
    @DeleteMapping(value = "/excluir/{codigo}")
    public void excluir(@PathVariable int codigo) { exercicioRepository.deleteById(codigo); }
}
