package com.api.mywallet.core.model;

import com.api.mywallet.dtos.WalletDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tab_wallets")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private double balance;

    @OneToMany(mappedBy = "wallet")
    private List<Transaction> transactionList;

    public Wallet() {
    }

    public Wallet(WalletDTO walletDTO) {
        this.user = walletDTO.user();
        this.balance = walletDTO.balance();
        this.transactionList = walletDTO.transactionList();
    }

    public Wallet(User user, double balance) {
        this.user = user;
        this.balance = balance;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
