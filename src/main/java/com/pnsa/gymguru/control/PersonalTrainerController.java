package com.pnsa.gymguru.control;

import com.pnsa.gymguru.model.PersonalTrainer;
import com.pnsa.gymguru.repository.PersonalTrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/gymguru/personalTrainer")
public class PersonalTrainerController {
    @Autowired
    PersonalTrainerRepository personalTrainerRepository;

    // -- GET
    @GetMapping(value = "/buscar/{codigo}")
    public Optional<PersonalTrainer> buscarCodigo(@PathVariable int codigo) { return personalTrainerRepository.findById(codigo); }

    @GetMapping(value = "/buscar/todos")
    public List<PersonalTrainer> buscarTodos() { return personalTrainerRepository.findAll(); }

    // -- POST
    @PostMapping(value = "/cadastrar")
    public void cadastrarPersonalTrainer(@RequestBody PersonalTrainer personalTrainer) { personalTrainerRepository.save(personalTrainer); }

    // -- PUT
    @PutMapping(value = "/editar")
    public void editarPersonalTrainer(@RequestBody PersonalTrainer personalTrainer) { personalTrainerRepository.save(personalTrainer); }

    // -- DELETE
    @DeleteMapping(value = "/excluir/{codigo}")
    public void excluirPersonalTrainer(@PathVariable int codigo) { personalTrainerRepository.deleteById(codigo); }
}
