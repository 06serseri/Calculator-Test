package com.example.calculatortest;

public class TestFinancing {

    static int vehicleMsrp;
    static double termInMonths, paymentFrequencyFactor, rate, rateFactor, payment, power, taxRate;
    static String paymentFrequency; // OR BI-WEEKLY

    static void calculateFinancing(){
        //Start
        //TESTING MSRP VALIDATION - SEEMS TO BE WORKING FOR MSRP
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("Please enter vehicle MSRP");
//            while (!scanner.hasNextInt()) {
//                System.out.println("Please enter a valid MSRP");
//                scanner.next(); // this is important!
//            }
//            vehicleMsrp = scanner.nextInt();
//        } while (vehicleMsrp <= 0);//DOESN'T WORK PROPERLY FOR ZERO
//        System.out.println("Thank you! Got " + vehicleMsrp);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter vehicle MSRP");
//        Financing.vehicleMsrp = scanner.nextInt();

        //TESTING FINANCING TERM VALIDATION - SEEMS TO BE WORKING FOR TERM
//        do {
//            System.out.println("Please enter the financing term");
//            while (!scanner.hasNextDouble()) {
//                System.out.println("Please enter a valid financing term");
//                scanner.next(); // this is important!
//            }
//            termInMonths = scanner.nextDouble();
//        } while (termInMonths <= 0);
//        System.out.println("Thank you! Got " + termInMonths);
//        System.out.println("Please enter the financing term");
//        Financing.termInMonths = scanner.nextDouble();
//
//        //TESTING FINANCING RATE VALIDATION
////        do {
////            System.out.println("Please enter the financing rate");
////            while (!scanner.hasNextDouble()) {
////                System.out.println("Please enter a valid financing rate");
////                scanner.next(); // this is important!
////            }
////            rate = scanner.nextDouble();
////        } while (rate <= 0);
////        System.out.println("Thank you! Got " + rate);
//        System.out.println("Please enter the financing rate");
//        Financing.rate = scanner.nextDouble();
//
//        System.out.println("Please enter payment frequency");
//        paymentFrequency = scanner.next();

        if(paymentFrequency.equals("Monthly")){
            paymentFrequencyFactor = 12.0;
            rate = (rate/(paymentFrequencyFactor*100));
        } else if (paymentFrequency.equals("Biweekly")){
            paymentFrequencyFactor = 26.0;
            rate = (rate/(paymentFrequencyFactor*100));
        } else
            System.out.println("WRONG PAYMENT FREQUENCY!");

        rateFactor = Math.pow((1 + rate),(termInMonths/12.0*paymentFrequencyFactor));

        payment = (( vehicleMsrp - ( 0 / rateFactor ) )  /  ( (1 - ( 1 / rateFactor ) ) / rate ) * (1 + taxRate/100));

        power = (termInMonths/12.0*paymentFrequencyFactor);
        System.out.println("Power is: " + (termInMonths/12.0*paymentFrequencyFactor));
        System.out.println("Rate: " + rate);
        System.out.println("Rate Factor: " + rateFactor);
        System.out.println("Monthly Financing Payment: " + payment);
    }

}

//    //Start
//    //TESTING MSRP VALIDATION - SEEMS TO BE WORKING FOR MSRP
//    Scanner scanner = new Scanner(System.in);
//        do {
//                System.out.println("Please enter vehicle MSRP");
//                while (!scanner.hasNextInt()) {
//                System.out.println("Please enter a valid MSRP");
//                scanner.next(); // this is important!
//                }
//                Financing.vehicleMsrp = scanner.nextInt();
//                } while (Financing.vehicleMsrp <= 0);//DOESN'2T WORK PROPERLY FOR ZERO
//                System.out.println("Thank you! Got " + Financing.vehicleMsrp);
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Please enter vehicle MSRP");
////        Financing.vehicleMsrp = scanner.nextInt();
//
//                //TESTING FINANCING TERM VALIDATION - SEEMS TO BE WORKING FOR TERM
//                do {
//                System.out.println("Please enter the financing term");
//                while (!scanner.hasNextDouble()) {
//                System.out.println("Please enter a valid financing term");
//                scanner.next(); // this is important!
//                }
//                Financing.termInMonths = scanner.nextDouble();
//                } while (Financing.termInMonths <= 0);
//                System.out.println("Thank you! Got " + Financing.termInMonths);
////        System.out.println("Please enter the financing term");
////        Financing.termInMonths = scanner.nextDouble();
//
//                //TESTING FINANCING RATE VALIDATION
//                do {
//                System.out.println("Please enter the financing rate");
//                while (!scanner.hasNextDouble()) {
//                System.out.println("Please enter a valid financing rate");
//                scanner.next(); // this is important!
//                }
//                Financing.rate = scanner.nextDouble();
//                } while (Financing.rate <= 0);
//                System.out.println("Thank you! Got " + Financing.rate);
////        System.out.println("Please enter the financing rate");
////        Financing.rate = scanner.nextDouble();
//
//                System.out.println("Please enter payment frequency");
//                Financing.paymentFrequency = scanner.next();
//
//                if(Financing.paymentFrequency.equals("monthly")){
//                Financing.paymentFrequencyFactor = 12.0;
//                Financing.rate = (Financing.rate/(Financing.paymentFrequencyFactor*100));
//                } else if (Financing.paymentFrequency.equals("biweekly")){
//                Financing.paymentFrequencyFactor = 26.0;
//                Financing.rate = (Financing.rate/(Financing.paymentFrequencyFactor*100));
//                } else
//                System.out.println("WRONG PAYMENT FREQUENCY!");
//
//                Financing.rateFactor = Math.pow((1 + Financing.rate),(Financing.termInMonths/12.0*Financing.paymentFrequencyFactor));
//
//                Financing.payment = ( Financing.vehicleMsrp - ( 0 / Financing.rateFactor ) )  /  ( (1 - ( 1 / Financing.rateFactor ) ) / Financing.rate );
//
//                Financing.power = (Financing.termInMonths/12.0*Financing.paymentFrequencyFactor);
//                System.out.println("Power is: " + Financing.power);
//                System.out.println("Rate: " + Financing.rate);
//                System.out.println("Rate Factor: " + Financing.rateFactor);
//                System.out.println("Monthly Financing Payment: " + Financing.payment);