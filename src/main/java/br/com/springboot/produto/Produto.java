package br.com.springboot.produto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String produto;


}
