package com.api.mywallet.dtos;

import com.api.mywallet.core.model.Transaction;
import com.api.mywallet.core.model.User;

import java.util.List;

public record WalletDTO(Double balance, User user, List<Transaction> transactionList) {
}
