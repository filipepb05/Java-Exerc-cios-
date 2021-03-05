package br.com.cwi.reset.exemploreset.repository;

import br.com.cwi.reset.exemploreset.domain.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    private static List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> listarUsuarios(){
        return usuarios;
    }

    public Usuario addUsuario(final Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }

//    public Usuario removeUsuario(Usuario usuario){
//        usuarios.remove(usuario);
//        return usuario;
//    }

}
