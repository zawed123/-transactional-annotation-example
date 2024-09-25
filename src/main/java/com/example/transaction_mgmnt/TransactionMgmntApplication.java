package com.example.transaction_mgmnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TransactionMgmntApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionMgmntApplication.class, args);
	}

}
