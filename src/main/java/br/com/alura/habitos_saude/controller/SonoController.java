package br.com.alura.habitos_saude.controller;


import br.com.alura.habitos_saude.model.Sono;
import br.com.alura.habitos_saude.repository.SonoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sono")
public class SonoController {
    private final SonoRepository repository;

    public SonoController(SonoRepository repository) {
        this.repository = repository;

    }

    @GetMapping("/listar")
    public List<Sono> listar() {
        return repository.findAll();
    }

    @PostMapping("/salvar")
    public Sono salvar(@RequestBody Sono sono) {
        return repository.save(sono);
    }

    @PutMapping("/editar/{id}")
    public Sono editar(@PathVariable Long id, @RequestBody Sono sono) {
        sono.setId(id);
        return repository.save(sono);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
