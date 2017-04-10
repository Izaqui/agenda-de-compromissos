/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.poo.agenda.de.compromissos.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Negão
 */
public class Agenda {
    private String nome;
    private List<Compromisso> compromissos;

    public Agenda(String nome) {
        this.nome = nome;
        this.compromissos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Compromisso> getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(List<Compromisso> compromissos) {
        this.compromissos = compromissos;
    }

    @Override
    public String toString() {
        return "Agenda{" + "nome=" + nome + ", compromissos=" + compromissos + '}';
    }
    
    
}
