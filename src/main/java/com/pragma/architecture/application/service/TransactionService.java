package com.pragma.architecture.application.service;

import com.pragma.architecture.domain.model.BankTransaction;
import com.pragma.architecture.infrastructure.persistence.TransactionRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Transactional
    public BankTransaction processTransaction(BankTransaction transaction) {
        // Lógica de procesamiento de transacción
        return transactionRepository.save(transaction);
    }
}