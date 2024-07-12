interface Tax {
    double calculateTax(double income);
}

class KA implements Tax {
    static final double CENTRAL_TAX_RATE = 0.057;
    static final double STATE_TAX_RATE = 0.035;

    @Override
    public double calculateTax(double income) {
        return income * (CENTRAL_TAX_RATE + STATE_TAX_RATE);
    }
}

class MH implements Tax {
    static final double CENTRAL_TAX_RATE = 0.057;
    static final double STATE_TAX_RATE = 0.045;

    @Override
    public double calculateTax(double income) {
        return income * (CENTRAL_TAX_RATE + STATE_TAX_RATE);
    }
}

class HR implements Tax {
    static final double CENTRAL_TAX_RATE = 0.057;
    static final double STATE_TAX_RATE = 0.025;

    @Override
    public double calculateTax(double income) {
        return income * (CENTRAL_TAX_RATE + STATE_TAX_RATE);
    }
}

class UP implements Tax {
    static final double CENTRAL_TAX_RATE = 0.074;
    static final double STATE_TAX_RATE = 0.0; // Assuming no state tax for UP

    @Override
    public double calculateTax(double income) {
        return income * (CENTRAL_TAX_RATE + STATE_TAX_RATE);
    }
}

class HP implements Tax {
    static final double CENTRAL_TAX_RATE = 0.057;
    static final double STATE_TAX_RATE = 0.053;

    @Override
    public double calculateTax(double income) {
        return income * (CENTRAL_TAX_RATE + STATE_TAX_RATE);
    }
}

public class Main {
    public static void main(String[] args) {
        double income = 10000;

        Tax kaTax = new KA();
        Tax mhTax = new MH();
        Tax hrTax = new HR();
        Tax upTax = new UP();
        Tax hpTax = new HP();

        System.out.println("Tax calculation for Karnataka (KA): " + kaTax.calculateTax(income));
        System.out.println("Tax calculation for Maharashtra (MH): " + mhTax.calculateTax(income));
        System.out.println("Tax calculation for Haryana (HR): " + hrTax.calculateTax(income));
        System.out.println("Tax calculation for Uttar Pradesh (UP): " + upTax.calculateTax(income));
        System.out.println("Tax calculation for Himachal Pradesh (HP): " + hpTax.calculateTax(income));
    }
}
