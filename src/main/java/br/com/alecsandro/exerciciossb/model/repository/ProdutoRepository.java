package br.com.alecsandro.exerciciossb.model.repository;

import br.com.alecsandro.exerciciossb.model.entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
