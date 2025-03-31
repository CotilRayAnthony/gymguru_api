package com.pnsa.gymguru.model;

import jakarta.persistence.*;

@Entity
@Table(name = "gymguru_academia")
public class Academia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int codigo;

    @Column(nullable = false)
    private String cnpj;

    @Column
    private String nome;

    @Column
    private String endereco;

    // Getters
    public int getCodigo()      { return this.codigo; }
    public String getCnpj()     { return this.cnpj; }
    public String getNome()     { return this.nome; }
    public String getEndereco() { return this.endereco; }

    // Setters
    public void setCnpj(String cnpj)         { this.cnpj = cnpj; }
    public void setNome(String nome)         { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}