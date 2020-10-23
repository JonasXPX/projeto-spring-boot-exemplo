package br.uniamerica.cadastros.usuario.repository;

import br.uniamerica.cadastros.usuario.modal.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {


  List<Usuario> findAllByIdade(Integer idade);

  @Query("SELECT nome FROM Usuario")
  List<String> listarTodosOsNomes();
}
