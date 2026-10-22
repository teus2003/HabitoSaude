package br.com.alura.habitos_saude.repository;

import br.com.alura.habitos_saude.model.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {

}