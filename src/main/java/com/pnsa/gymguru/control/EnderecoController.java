package com.pnsa.gymguru.control;

import com.pnsa.gymguru.model.Endereco;
import com.pnsa.gymguru.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/gymguru/endereco")
public class EnderecoController {
    @Autowired
    EnderecoRepository enderecoRepository;
    
    // -- GET
    @GetMapping(value = "/buscar/{codigo}")
    public Optional<Endereco> buscarEndereco(@PathVariable int codigo) { return enderecoRepository.findById(codigo); }
    
    @GetMapping(value = "/buscar/todos")
    public List<Endereco> buscarTodos() { return enderecoRepository.findAll(); }
    
    // -- POST
    @PostMapping(value = "/cadastrar")
    public void cadastrar(@RequestBody Endereco endereco) { enderecoRepository.save(endereco); }

    // -- PUT
    @PutMapping(value = "/editar")
    public void editar(@RequestBody Endereco endereco) { enderecoRepository.save(endereco); }

    // -- DELETE
    @DeleteMapping(value = "/excluir/{codigo}")
    public void excluir(@PathVariable int codigo) { enderecoRepository.deleteById(codigo); }
}
