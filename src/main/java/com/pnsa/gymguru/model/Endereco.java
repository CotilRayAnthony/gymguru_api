package com.pnsa.gymguru.model;

import jakarta.persistence.*;

@Entity
@Table(name = "gymguru_endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int codigo;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String numero;

    @Column
    private String complemento;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String estado;

    // Getters
    public int getCodigo() { return this.codigo; }
    public String getRua() { return  this.rua; }
    public String getBairro() { return  this.bairro; }
    public String getNumero() { return  this.numero; }
    public String getComplemento() { return  this.complemento; }
    public String getCep() { return  this.cep; }
    public String getCidade() { return  this.cidade; }
    public String getEstado() { return  this.estado; }

    // Setters
    public void setRua(String rua) { this.rua = rua; }
    public void setBairro(String bairro) { this.bairro = bairro; }
    public void setNumero(String numero) { this.numero = numero; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
    public void setCep(String cep) { this.cep = cep; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setEstado(String estado) { this.estado = estado; }
}
