package com.example.transaction_mgmnt.utils;

import com.example.transaction_mgmnt.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentValidation {

    private static Map<String,Double> accountDetails=new HashMap<>();

    static {
        accountDetails.put("acc1",10000.0);
        accountDetails.put("acc2",50000.0);
        accountDetails.put("acc3",80000.0);
        accountDetails.put("acc4",60000.0);
    }

    public static boolean validateCreditLimit(String accountNo,Double amount)
    {
        if(accountDetails.get(accountNo)<amount)
        {
          // throw exception
            throw new InsufficientAmountException("insufficient fund..!");
        }else {
            return true;
        }
    }
}
