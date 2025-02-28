package org.emsi.ebankingbackend.repositories;


import org.emsi.ebankingbackend.entities.AccountOperation;
import org.emsi.ebankingbackend.entities.BankAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,String> {

     List<AccountOperation> findByBankAccountId (String accountId);
     Page<AccountOperation> findByBankAccountIdOrderByOperationDateDesc(String accountId, Pageable pageable);
}
