package com.pnsa.gymguru.model;

import jakarta.persistence.*;

@Entity
@Table(name = "gymguru_treino")
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int codigo;

    @Column
    private String exercicio; ////

    @Column
    private String serieRepeticao;

    @Column
    private int intervalo;

    @Column
    private String usuario; ////

    @Column
    private String personalTrainer; /////

    // Getters
    public int getCodigo()             { return this.codigo; }
    public String getExercicio()       { return this.exercicio; }
    public String getSerieRepeticao()  { return this.serieRepeticao; }
    public int getIntervalo()          { return this.intervalo; }
    public String getUsuario()         { return this.usuario; }
    public String getPersonalTrainer() { return this.personalTrainer; }

    // Setters
    public void setExercicio(String exercicio)             { this.exercicio = exercicio; }
    public void setSerieRepeticao(String serieRepeticao)   { this.serieRepeticao = serieRepeticao; }
    public void setIntervalo(int intervalo)                { this.intervalo = intervalo; }
    public void setUsuario(String usuario)                 { this.usuario = usuario; }
    public void setPersonalTrainer(String personalTrainer) { this.personalTrainer = personalTrainer; }
}
