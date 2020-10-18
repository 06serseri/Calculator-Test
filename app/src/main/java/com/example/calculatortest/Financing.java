package com.example.calculatortest;

public class Financing {

    static int vehicleMsrp;
    static double termInMonths;
    //public static int downPayment;
    //public static int futureValue;
    //public static int taxRate;
    //BI-WEEKLY OR MONTHLY STRING OR INTEGER SHOULDNT MATTER IT WOULD BE A DROPDOWNISH SELECTION
    static String paymentFrequency; // OR BI-WEEKLY
    static double paymentFrequencyFactor;
    static double rate;
    static double rateFactor;
    static double payment;
    static double power;

    public Financing() {
    }

    public static int getVehicleMsrp() {
        return vehicleMsrp;
    }

    public static void setVehicleMsrp(int vehicleMsrp) {
        Financing.vehicleMsrp = vehicleMsrp;
    }

    public static double getTermInMonths() {
        return termInMonths;
    }

    public static void setTermInMonths(double termInMonths) {
        Financing.termInMonths = termInMonths;
    }

    public static String getPaymentFrequency() {
        return paymentFrequency;
    }

    public static void setPaymentFrequency(String paymentFrequency) {
        Financing.paymentFrequency = paymentFrequency;
    }

    public static double getPaymentFrequencyFactor() {
        return paymentFrequencyFactor;
    }

    public static void setPaymentFrequencyFactor(double paymentFrequencyFactor) {
        Financing.paymentFrequencyFactor = paymentFrequencyFactor;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Financing.rate = rate;
    }

    public static double getRateFactor() {
        return rateFactor;
    }

    public static void setRateFactor(double rateFactor) {
        Financing.rateFactor = rateFactor;
    }

    public static double getPayment() {
        return payment;
    }

    public static void setPayment(double payment) {
        Financing.payment = payment;
    }

    public static double getPower() {
        return power;
    }

    public static void setPower(double power) {
        Financing.power = power;
    }


    static void calculateFinancing(){

    }



//    payment = ( vehicleMsrp - ( 0 / rateFactor ) )  /  ( (1 - ( 1 / rateFactor ) ) / rate );
//    LEASE needs a residual value - https://ic.gc.ca/app/scr/oca-bc/ssc/vehicle.html?lang=eng
//        System.out.println("Rate; " + rate);
//        System.out.println("Rate Factor: " + rateFactor);
//        System.out.println("Lease Payment: " + payment);


}
