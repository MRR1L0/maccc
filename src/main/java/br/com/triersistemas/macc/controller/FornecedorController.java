package br.com.triersistemas.macc.controller;

import br.com.triersistemas.macc.domain.Farmaceutico;
import br.com.triersistemas.macc.domain.Fornecedor;
import br.com.triersistemas.macc.model.FarmaceuticoModel;
import br.com.triersistemas.macc.model.FornecedorModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
    private  final List<Fornecedor> LIST = new ArrayList<>();

    @GetMapping("/consultar")
    public List<Fornecedor> consultar(){return  LIST;}

    @PostMapping("/cadastrar")
    public List<Fornecedor> cadastrar(@RequestBody FornecedorModel model){
        LIST.add(new Fornecedor(model.getNome(), model.getAniver(),model.getCnpj(), model.getId()));
        return LIST;
    }
    @DeleteMapping("/alterar/{index}")
    public List<Fornecedor> remover(@PathVariable Integer index, @RequestBody FornecedorModel model) {
        Fornecedor contato = LIST.get(index);
        LIST.remove(contato);
        LIST.add(new Fornecedor(model.getNome(), model.getAniver(), model.getCnpj(), model.getId()));
        return LIST;
    }

    @DeleteMapping("/remover/{index}")
    public List<Fornecedor> remover(@PathVariable int index) {
        LIST.remove(index);
        return LIST;
    }
}
