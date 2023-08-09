package com.vitu.relationship01.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "colaboradores")
@Getter
@Setter
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String nome;

    @OneToOne //vinculo entre o colaborador e o cargo
    @JoinColumn(name = "codigo_cargo", referencedColumnName = "codigo")
    //name -> nome da coluna que vai armazenar o codigo do cargo
    //referencedColumnName -> qual caracteristica da minha classe cargo eu to utilizando como chave estrangeira, vamos usar o id 'codigo'
    private Cargo cargo;
}
