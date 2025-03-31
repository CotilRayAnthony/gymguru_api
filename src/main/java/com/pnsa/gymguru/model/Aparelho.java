package com.pnsa.gymguru.model;

import jakarta.persistence.*;

@Entity
@Table(name = "gymguru_aparelho")
public class Aparelho {
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

    @Column(nullable = false)
    private boolean disponivel;

    // Getters
    public int getCodigo()                 { return this.codigo; }
    public String getNome()                { return this.nome; }
    public String getMusculosTrabalhados() { return this.musculosTrabalhados; }
    public String getDificuldadeExecucao() { return this.dificuldadeExecucao; }
    public boolean getDisponivel()         { return this.disponivel; }

    // Setters
    public void setNome(String nome)                               { this.nome = nome; }
    public void setMusculosTrabalhados(String musculosTrabalhados) { this.musculosTrabalhados = musculosTrabalhados; }
    public void setDificuldadeExecucao(String dificuldadeExecucao) { this.dificuldadeExecucao = dificuldadeExecucao; }
    public void setDisponivel(boolean disponivel)                  { this.disponivel = disponivel; }
}
