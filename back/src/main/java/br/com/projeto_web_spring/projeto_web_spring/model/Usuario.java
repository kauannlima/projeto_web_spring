package br.com.projeto_web_spring.projeto_web_spring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;

    @Column(name = "nome", length = 200, nullable = true)
    public String nome;

    @Column(name = "email", length = 50, nullable = true)
    public  String email;

    @Column(name = "senha", columnDefinition = "TEXT", nullable = true)
    public  String senha;

    @Column(name = "telefone", length = 15, nullable = true)
    public  String telefone;
}
