package br.com.alecsandro.exerciciossb.model.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "producos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @NotEmpty(message = "O nome deve ser informado")
    @NotBlank(message = "O nome deve ser informado")
    private String nome;

    @Min(0)
    private Double valor;

    @Min(value = 0, message = "O valor deve estar entre 0 e 1")
    @Max(value = 1, message = "O valor deve estar entre 0 e 1")
    private Double desconto;

    public Produto() {
    }

    public Produto(String nome, Double valor, Double desconto) {
        this.nome = nome;
        this.valor = valor != null ? valor : 0.00;
        this.desconto = desconto != null ? desconto : 0.00;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor != null ? valor : 0.00;
    }

    public void setValor(Double valor) {
        this.valor = valor != null ? valor : 0.00;
    }

    public Double getDesconto() {
        return desconto != null ? desconto : 0.00;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto != null ? desconto : 0.00;
    }
}
