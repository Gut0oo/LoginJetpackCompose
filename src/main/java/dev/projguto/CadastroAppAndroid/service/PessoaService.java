package dev.projguto.CadastroAppAndroid.service;

import dev.projguto.CadastroAppAndroid.dao.PessoaDAO;
import dev.projguto.CadastroAppAndroid.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    private final PessoaDAO dao;

    public PessoaService(PessoaDAO dao) {
        this.dao = dao;
    }

    public List<Pessoa> getAll(){
        return dao.findAll();
    }

    public Pessoa save(Pessoa user){
        return dao.save(user);
    }

    public void delete(Long id){
        dao.deleteById(id);
    }
}
