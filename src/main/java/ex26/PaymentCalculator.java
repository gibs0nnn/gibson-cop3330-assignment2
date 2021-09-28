package ex26;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double p, double i, double b) {

        //-(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //double months = (-1.0/30.0) * ( Math.log(1.0 + b / p * (1.0 - Math.pow(1.0 + i, 30.0) ) ) ) / Math.log(1.0 + i);
        double partOne = (-1.0 / 30.0);
        //System.out.println(partOne);
        double partTwo= ( Math.log((1.0 + b) / p)); //* (1.0 - Math.pow(1.0 + i, 30.0) ) ) );
        //System.out.println(partTwo);
        double partThree = partTwo * (1.0 - (Math.pow(1.0 + i, 30.0)));
        //System.out.println(partThree);
        double partFour = partThree / (Math.log(1.0 + i));
        //System.out.println(partFour);

        double months = partFour;
        return months;
    }
}
