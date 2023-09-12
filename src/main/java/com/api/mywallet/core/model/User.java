package com.api.mywallet.core.model;

import com.api.mywallet.dtos.UserDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String cpf;

    @Column(unique = true)
    private String email;

    @OneToOne
    private Wallet wallet = new Wallet();

    public User() {
    }

    public User(UserDTO userDTO) {
        this.firstName = userDTO.firstName();
        this.lastName = userDTO.lastName();
        this.cpf = userDTO.cpf();
        this.email = userDTO.email();
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
