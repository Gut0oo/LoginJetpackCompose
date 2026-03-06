package dev.projguto.CadastroAppAndroid.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PESSOA")
@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String fullname;
    private String email;
    private String password;

    public Pessoa(){}

    public Pessoa(String email, String fullname, String password, String username) {
        this.email = email;
        this.fullname = fullname;
        this.password = password;
        this.username = username;
    }
}
