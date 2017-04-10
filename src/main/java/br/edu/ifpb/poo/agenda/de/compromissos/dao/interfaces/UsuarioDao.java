/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.poo.agenda.de.compromissos.dao.interfaces;

import br.edu.ifpb.poo.agenda.de.compromissos.entidades.Usuario;
import java.util.List;

/**
 *
 * @author Negão
 */
public interface UsuarioDao {
    void addUsuario(Usuario usuario);
    Usuario buscarUsuario(String email);
    void dellUsuario(String email);
    List<Usuario> listarUsuario();
    void editUsuario(Usuario usuario);
}
