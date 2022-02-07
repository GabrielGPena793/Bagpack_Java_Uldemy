package com.uldemy.services;

import com.uldemy.entities.Contract;
import com.uldemy.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double ValueDivided = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++){
            Date date = addMonths(contract.getDate(), i);
            double valueTax = onlinePaymentService.interest(ValueDivided, i);

            contract.addInstallment(new Installment(date, valueTax));
        }
    }

    private Date addMonths(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }
}
