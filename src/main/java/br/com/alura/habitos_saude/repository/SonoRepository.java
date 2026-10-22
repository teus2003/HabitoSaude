package br.com.alura.habitos_saude.repository;

import br.com.alura.habitos_saude.model.Sono;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SonoRepository extends JpaRepository<Sono, Long> {

}
