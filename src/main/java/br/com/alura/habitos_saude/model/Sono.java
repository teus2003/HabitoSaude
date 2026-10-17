package br.com.alura.habitos_saude.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "sono")
@Getter
@Setter


public class Sono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double horasDormidas;
    private String qualidade;
    private  LocalDate data;

}
