package bookscoffe.itb.bookstcc2g.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookscoffe.itb.bookstcc2g.model.Usuario;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
