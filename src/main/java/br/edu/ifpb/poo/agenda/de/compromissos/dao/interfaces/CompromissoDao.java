/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.poo.agenda.de.compromissos.dao.interfaces;

import br.edu.ifpb.poo.agenda.de.compromissos.entidades.Compromisso;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
/**
 *
 * @author Negão
 */
public interface CompromissoDao {
    void addCompromisso(Compromisso compromisso);
    Compromisso buscarCompromisso(LocalDate data, LocalDateTime hora);
    void dellCompromisso(LocalDate data, LocalDateTime hora);
    List<Compromisso> listarCompromisso();
    void editCompromisso(Compromisso compromisso);
}
