package bmikalkulator;

import java.util.Locale;
import java.util.Scanner;

public class BmiKalkulator {

    public static void main(String[] args) {
        cim();
        int tomeg = beker(40, 150, "tömegét");
        int magassag = beker(100, 200, "magasságát");
        double bmiIndex = bmi(tomeg, magassag);
        ertekeles(bmiIndex, tomeg, magassag);

    }

    private static void cim() {
        System.out.println("BMI index kiszámítása.");
    }

    private static int beker(int also, int felso, String szoveg) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Kérem adja meg a %s.\n", szoveg);
        int bekertSzam = sc.nextInt();
        while (!(also <= bekertSzam && bekertSzam <= felso)) {
            System.out.printf("Kérem adja meg újra a %s.\n", szoveg);
            bekertSzam = sc.nextInt();
        }
        return bekertSzam;
    }

    private static double bmi(int tomeg, int magassag) {
        return tomeg/((magassag/100.0)*(magassag/100.0));
    }

    private static void ertekeles(double bmiIndex, int tomeg, int magassag) {
        System.out.printf("Ön %d cm magas és %d kg tömegű.\n", magassag, tomeg);
        System.out.printf(Locale.ENGLISH, "Így BMI indexe: %1f.\n", bmiIndex);
        if (bmiIndex <= 20.0){
            System.out.println("Ön sovány.");
        }else if (bmiIndex > 20.0 && bmiIndex <= 25.0){
            System.out.println("Ön normál testalkatú.");
        }else if (bmiIndex > 25.0 && bmiIndex <= 30.0){
            System.out.println("Ön túlsúlyos.");
        }else if (bmiIndex > 30.0 && bmiIndex <= 35.0){
            System.out.println("Ön elhízott.");
        }else if (bmiIndex > 35.0){
            System.out.println("Ön kórosan elhízott.");
        }
        
        
        
    }

}
