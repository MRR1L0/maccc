package br.com.triersistemas.macc.controller;

import br.com.triersistemas.macc.domain.Farmaceutico;
import br.com.triersistemas.macc.model.FarmaceuticoModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

@RestController
@RequestMapping("/farmaceutico")
public class FarmaceuticoController {
    private final Map<Geraid,Farmaceutico> LIST = new ArrayList<>();

    @GetMapping("/consultar")
    public List<Farmaceutico> consultar() {
        return LIST;
    }

    @PostMapping("/cadastrar")
    public List<Farmaceutico> cadastrar(@RequestBody FarmaceuticoModel model) {
        var rd = new SplittableRandom();

        LIST.add(new Farmaceutico(model.getNome(), model.getAniver(), model.getCpf(), model.getId()));
        return LIST;
    }


    @DeleteMapping("/alterar/{index}")
    public List<Farmaceutico> remover(@PathVariable Integer index, @RequestBody FarmaceuticoModel model) {
        var contato = LIST.get(index);
        LIST.remove(contato);
        LIST.add(new Farmaceutico(model.getNome(), model.getAniver(), model.getCpf(), model.getId()));
        return LIST;
    }

    @DeleteMapping("/remover/{index}")
    public List<Farmaceutico> remover(@PathVariable int index) {
        LIST.remove(index);
        return LIST;
    }
}
