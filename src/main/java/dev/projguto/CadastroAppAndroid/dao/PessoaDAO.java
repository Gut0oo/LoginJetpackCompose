package dev.projguto.CadastroAppAndroid.dao;

import dev.projguto.CadastroAppAndroid.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaDAO extends JpaRepository<Pessoa, Long> {
}
