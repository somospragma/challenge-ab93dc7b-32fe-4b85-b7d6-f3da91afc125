package com.pragma.architecture.domain.model;

public record BankTransaction(Long id, String accountNumber, double amount, String transactionType, String status) {}