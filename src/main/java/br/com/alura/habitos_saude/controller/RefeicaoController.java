package br.com.alura.habitos_saude.controller;

import br.com.alura.habitos_saude.model.Refeicao;
import br.com.alura.habitos_saude.repository.RefeicaoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/refeicao")
public class RefeicaoController {
    private final RefeicaoRepository repository;

    public RefeicaoController(RefeicaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/listar")
    public List<Refeicao> listar() {
        return repository.findAll();
    }

    @PostMapping("/salvar")
    public Refeicao salvar(@RequestBody Refeicao refeicao) {
        return repository.save(refeicao);
    }

    @PutMapping("/editar/{id}")
    public Refeicao editar(@PathVariable Long id, @RequestBody Refeicao refeicao) {
        refeicao.setId(id);
        return repository.save(refeicao);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}