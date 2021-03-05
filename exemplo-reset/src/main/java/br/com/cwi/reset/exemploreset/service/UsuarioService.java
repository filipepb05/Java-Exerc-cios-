package br.com.cwi.reset.exemploreset.service;

import br.com.cwi.reset.exemploreset.domain.Usuario;
import br.com.cwi.reset.exemploreset.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuario(){
        return usuarioRepository.listarUsuarios();
    }

    public Usuario criarUsuario(Usuario usuario){
        return usuarioRepository.addUsuario(usuario);
    }

}
