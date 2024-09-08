package com.moneyTracker.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfilePostDto {
    private double balance;
    private double totalIncome;
    private double totalExpense;
    private double totalSavings;
    private int userId;
}
