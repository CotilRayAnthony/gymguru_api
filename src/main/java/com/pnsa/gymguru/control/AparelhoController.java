package com.pnsa.gymguru.control;

import com.pnsa.gymguru.model.Aparelho;
import com.pnsa.gymguru.repository.AparelhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/gymguru/aparelho")
public class AparelhoController {
    @Autowired
    AparelhoRepository aparelhoRepository;

    // -- GET
    @GetMapping(value = "/buscar/{codigo}")
    public Optional<Aparelho> buscarAparelho(@PathVariable int codigo) { return aparelhoRepository.findById(codigo); }

    @GetMapping(value = "/buscar/todos")
    public List<Aparelho> buscarTodos() { return aparelhoRepository.findAll(); }

    // -- POST
    @PostMapping(value = "/cadastrar")
    public void cadastrar(@RequestBody Aparelho aparelho) { aparelhoRepository.save(aparelho); }

    // -- PUT
    @PutMapping(value = "/editar")
    public void editar(@RequestBody Aparelho aparelho) { aparelhoRepository.save(aparelho); }

    // -- DELETE
    @DeleteMapping(value = "/excluir/{codigo}")
    public void excluir(@PathVariable int codigo) { aparelhoRepository.deleteById(codigo); }
}
