import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    public void Input() throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] str = reader.readLine().split(" ");;
        if (check(str[0])) {
            String str3 = str[1];
            Arithmetic operation = new Arithmetic(Integer.parseInt(str[0]), str3, Integer.parseInt(str[2]));
            System.out.println(operation.oper());
        } else {
            Roman roman = new Roman();
            int first = roman.digit(str[0]);
            int second = roman.digit(str[2]);

            Arithmetic operation = new Arithmetic(first, str[1], second);
            System.out.println(intToRomanNumb(operation.oper()));
         }

    }
    public static String intToRomanNumb(int f) {
        if (f > 101)
            return "0";
        String s4 = "";
        while (f >= 100) {
            s4 = s4 + "C";
            f = f - 100;
        }
        while (f >= 90) {
            s4 = s4 + "XC";
            f = f - 90;
        }
        while (f >= 50) {
            s4 = s4 + "L";
            f = f - 50;
        }
        while (f >= 40) {
            s4 = s4 + "XL";
            f = f - 40;
        }
        while (f >= 10) {
            s4 = s4 + "X";
            f = f - 10;
        }
        while (f >= 9) {
            s4 = s4 + "IX";
            f = f - 9;
        }

        while (f >= 5) {
            s4 = s4 + "V";
            f = f - 5;
        }
        while (f >= 4) {
            s4 = s4 + "IV";
            f = f - 4;
        }
        while (f >= 1) {
            s4 = s4 + "I";
            f = f - 1;
        }
        return s4;
    }

    private boolean check(String s) {
        String[] str2 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < 11; i++) {
            if (str2[i].equals(s)) {
                return true;
            }
        } return false;
    }
}
