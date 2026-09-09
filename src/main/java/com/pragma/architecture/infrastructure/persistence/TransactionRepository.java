package com.pragma.architecture.infrastructure.persistence;

import com.pragma.architecture.domain.model.BankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<BankTransaction, Long> {}