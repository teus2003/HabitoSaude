package br.com.alura.habitos_saude.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "exercicio")
@Getter
@Setter
public class Exercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data;
    private String nome;
    private Integer series;
    private Integer repeticoes;
    private Double carga;
    private Double tempo;


}
