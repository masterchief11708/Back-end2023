package bookscoffe.itb.bookstcc2g.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookscoffe.itb.bookstcc2g.model.Cardapio;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, Long> {

}
