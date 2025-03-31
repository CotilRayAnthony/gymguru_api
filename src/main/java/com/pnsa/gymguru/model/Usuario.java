package com.pnsa.gymguru.model;

import jakarta.persistence.*;

@Entity
@Table(name = "gymguru_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int codigo;

    @Column
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String celular;

    @Column(nullable = false, unique = true)
    private String cpf;

    // Getters
    public int getCodigo()     { return this.codigo; }
    public String getNome()    { return this.nome; }
    public String getEmail()   { return this.email; }
    public String getCelular() { return this.celular; }
    public String getCpf()     { return this.cpf; }

    // Setters
    public void setNome(String nome)       { this.nome = nome; }
    public void setEmail(String email)     { this.email = email; }
    public void setCelular(String celular) { this.celular = celular; }
    public void setCpf(String cpf)         { this.cpf = cpf; }
}
