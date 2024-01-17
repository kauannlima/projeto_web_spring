package br.com.projeto_web_spring.projeto_web_spring.DAO;

import br.com.projeto_web_spring.projeto_web_spring.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {
}
