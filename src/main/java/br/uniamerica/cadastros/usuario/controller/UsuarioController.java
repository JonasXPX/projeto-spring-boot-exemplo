package br.uniamerica.cadastros.usuario.controller;

import br.uniamerica.cadastros.usuario.modal.Usuario;
import br.uniamerica.cadastros.usuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

  private final UsuarioService usuarioService;

  @PutMapping
  @ResponseBody
  public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario) {
    return ResponseEntity.ok(usuarioService.salvarUsuario(usuario));
  }

  @GetMapping
  @ResponseBody
  public ResponseEntity<Iterable<Usuario>> listarUsuarios() {
    return ResponseEntity.ok(usuarioService.usuariosCadastros());
  }

  @GetMapping("/nomes")
  @ResponseBody
  public ResponseEntity<List<String>> listarNomes() {
    return ResponseEntity.ok(usuarioService.listarNomesDeUsuarios());
  }
}
