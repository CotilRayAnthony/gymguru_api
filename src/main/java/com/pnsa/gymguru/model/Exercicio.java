package com.pnsa.gymguru.model;

import jakarta.persistence.*;

@Entity
@Table(name = "gymguru_exercicio")
public class Exercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int codigo;

    @Column
    private String nome;

    @Column
    private String musculosTrabalhados;

    @Column
    private String dificuldadeExecucao;

    @Column
    private String aparelho; ////

    // Getters
    public int getCodigo()                 { return this.codigo; }
    public String getNome()                { return this.nome; }
    public String getMusculosTrabalhados() { return this.musculosTrabalhados; }
    public String getDificuldadeExecucao() { return this.dificuldadeExecucao; }
    public String getAparelho()            { return this.aparelho; }

    // Setters
    public void setNome(String nome)                               { this.nome = nome; }
    public void setMusculosTrabalhados(String musculosTrabalhados) { this.musculosTrabalhados = musculosTrabalhados; }
    public void setDificuldadeExecucao(String dificuldadeExecucao) { this.dificuldadeExecucao = dificuldadeExecucao; }
    public void setAparelho(String aparelho)                       { this.aparelho = aparelho; }
}
