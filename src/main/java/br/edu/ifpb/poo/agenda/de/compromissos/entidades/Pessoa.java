/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.poo.agenda.de.compromissos.entidades;

import java.time.LocalDate;

/**
 *
 * @author Negão
 */
public abstract class Pessoa {
    private String nome;
    private LocalDate nascimento;
    private String sexo;

    public Pessoa(String nome, LocalDate nascimento, String sexo) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", nascimento=" + nascimento + ", sexo=" + sexo + '}';
    }
    
}
