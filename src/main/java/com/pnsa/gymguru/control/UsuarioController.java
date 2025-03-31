package com.pnsa.gymguru.control;

import com.pnsa.gymguru.model.Usuario;
import com.pnsa.gymguru.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/gymguru/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    // -- GET
    @GetMapping(value = "/buscar/{codigo}")
    public Optional<Usuario> buscarCodigo(@PathVariable int codigo) { return usuarioRepository.findById(codigo); }

    @GetMapping(value = "/buscar/todos")
    public List<Usuario> buscarTodos() { return usuarioRepository.findAll(); }

    @GetMapping(value = "/buscar/email/{email}")
    public Optional<Usuario> buscarEmail(@PathVariable String email) { return usuarioRepository.findByEmail(email); }

    // -- POST
    @PostMapping(value = "/cadastrar")
    public void cadastrarUsuario(@RequestBody Usuario usuario) { usuarioRepository.save(usuario); }

    // -- PUT
    @PutMapping(value = "/editar")
    public void editarUsuario(@RequestBody Usuario usuario) { usuarioRepository.save(usuario); }

    // -- DELETE
    @DeleteMapping(value = "/excluir/{codigo}")
    public void excluirCodigo(@PathVariable int codigo) { usuarioRepository.deleteById(codigo); }
}
