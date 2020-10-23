package br.uniamerica.cadastros.usuario.service;

import br.uniamerica.cadastros.usuario.modal.Usuario;
import br.uniamerica.cadastros.usuario.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

  private final UsuarioRepository usuarioRepository;

  public Usuario salvarUsuario(Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  public Iterable<Usuario> usuariosCadastros() {
    return usuarioRepository.findAll();
  }

  public List<String> listarNomesDeUsuarios() {
    return usuarioRepository.listarTodosOsNomes();
  }

}
