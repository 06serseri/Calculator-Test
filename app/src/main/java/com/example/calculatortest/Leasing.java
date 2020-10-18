package com.example.calculatortest;

public class Leasing {
    static int vehicleMsrp, residualValue;
    static double termInMonths,paymentFrequencyFactor, rate, rateFactor, payment, power, taxRate;
    static String paymentFrequency; // OR BI-WEEKLY

    static void calculateLeasing(){
//        Determine Payment Frequency Factor
        if(paymentFrequency.equals("Monthly")){
            paymentFrequencyFactor = 12.0;
            rate = (rate/(paymentFrequencyFactor*100));
        } else if (paymentFrequency.equals("Biweekly")){
            paymentFrequencyFactor = 26.0;
            rate = (rate/(paymentFrequencyFactor*100));
        } else
            System.out.println("WRONG PAYMENT FREQUENCY!");

//        Calculate Rate Factor
        rateFactor = Math.pow((1 + rate),((termInMonths/12.0*paymentFrequencyFactor)-1));
//        Calculate Lease Payment
        payment = (( vehicleMsrp - ( residualValue / rateFactor ) )  /  ( (1 - ( 1 / rateFactor ) ) / rate ) + 1) * (1 + (taxRate/100));

        power = (termInMonths/12.0*paymentFrequencyFactor);
        System.out.println("Power is: " + ((termInMonths/12.0*paymentFrequencyFactor)-1));
        System.out.println("Residual value is: " + residualValue);
        System.out.println("Rate: " + rate);
        System.out.println("Rate Factor: " + rateFactor);
        System.out.println("Monthly Leasing Payment: " + payment);
    }
}
