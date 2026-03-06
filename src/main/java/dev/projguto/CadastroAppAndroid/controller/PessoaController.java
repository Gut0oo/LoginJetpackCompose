package dev.projguto.CadastroAppAndroid.controller;

import dev.projguto.CadastroAppAndroid.model.Pessoa;
import dev.projguto.CadastroAppAndroid.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class PessoaController {
    private final PessoaService service;

    public PessoaController(PessoaService service){
        this.service = service;
    }

    //Requesições
    @GetMapping
    public List<Pessoa> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Pessoa create(@RequestBody Pessoa user){
        return service.save(user);
    }

    @DeleteMapping
    public void delete(@RequestBody Pessoa user){
        service.delete(user.getId());
    }
}
