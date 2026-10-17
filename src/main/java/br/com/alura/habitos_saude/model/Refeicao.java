package br.com.alura.habitos_saude.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "refeicao")
@Getter
@Setter


public class Refeicao {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome;
private String tipo;
private Double quantidade;
private LocalDate data;

}
