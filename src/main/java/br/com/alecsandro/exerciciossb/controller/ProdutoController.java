package br.com.alecsandro.exerciciossb.controller;

import br.com.alecsandro.exerciciossb.model.entity.Produto;
import br.com.alecsandro.exerciciossb.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public @ResponseBody
    List<Produto> get() {
        List<Produto> produtos = (List<Produto>) produtoRepository.findAll();
        return produtos;
    }

    @PostMapping
    public @ResponseBody
    Produto post(Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
}
