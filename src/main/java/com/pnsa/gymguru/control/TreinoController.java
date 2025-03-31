package com.pnsa.gymguru.control;

import com.pnsa.gymguru.model.Treino;
import com.pnsa.gymguru.repository.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/gymguru/treino")
public class TreinoController {
    @Autowired
    TreinoRepository treinoRepository;

    // -- GET
    @GetMapping(value = "/buscar/{codigo}")
    public Optional<Treino> buscarTreino(@PathVariable int codigo) { return treinoRepository.findById(codigo); }

    @GetMapping(value = "/buscar/todos")
    public List<Treino> buscarTodos() { return treinoRepository.findAll(); }

    // -- POST
    @PostMapping(value = "/cadastrar")
    public void cadastrar(@RequestBody Treino treino) { treinoRepository.save(treino); }

    // -- PUT
    @PutMapping(value = "/editar")
    public void editar(@RequestBody Treino treino) { treinoRepository.save(treino); }

    // -- DELETE
    @DeleteMapping(value = "/excluir/{codigo}")
    public void excluir(@PathVariable int codigo) { treinoRepository.deleteById(codigo); }
}
