/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.poo.agenda.de.compromissos.dao.interfaces;

import br.edu.ifpb.poo.agenda.de.compromissos.entidades.Agenda;
import java.util.List;
/**
 *
 * @author Negão
 */
public interface AgendaDao {
    void addAgenda(Agenda agenda);
    Agenda buscarAgenda(String nome);
    void dellAgenda(String nome);
    List<Agenda> listarAgendas();
    void editAgenda(Agenda agenda);
}
