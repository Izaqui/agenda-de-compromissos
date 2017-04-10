/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.poo.agenda.de.compromissos.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Negão
 */
public class Compromisso {
      private LocalDate data;
      private LocalTime hora;
      private String descricao;
      private String local;
      private Agenda agenda;

    public Compromisso(LocalDate data, LocalTime hora, String descricao, String local, Agenda agenda) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.local = local;
        this.agenda = agenda;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    @Override
    public String toString() {
        return "Compromisso{" + "data=" + data + ", hora=" + hora + ", descricao=" + descricao + ", local=" + local + '}';
    }
      
}
