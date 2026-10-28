package br.com.alura.habitos_saude.controller;

import br.com.alura.habitos_saude.model.Exercicio;
import br.com.alura.habitos_saude.repository.ExercicioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicio")

public class ExercicioController {
    private final ExercicioRepository repository;

    public ExercicioController(ExercicioRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/listar")
    public List<Exercicio> listar() {
        return repository.findAll();
    }

    @PostMapping("/salvar")
    public Exercicio salvar(@RequestBody Exercicio exercicio) {
        return repository.save(exercicio);
    }

    @PutMapping("/editar/{id}")
    public Exercicio editar(@PathVariable Long id, @RequestBody Exercicio exercicio) {
        exercicio.setId(id);
        return repository.save(exercicio);
    }
    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
