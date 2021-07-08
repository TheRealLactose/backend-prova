package br.com.springboot.empresa;

import br.com.springboot.produto.Produto;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    private Produto produtoempresa;


}
