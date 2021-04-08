public class Arithmetic {

    int a ; int b; String c;

    public Arithmetic(int parseInt, String parseInt1, int parseInt2) {
        a = parseInt;
        c = parseInt1;
        b = parseInt2;
    }
    public int oper() throws Exception {
        if(a >=1 && a < 11 && b >=1 && b < 11 ) {

            switch (c){
                case "+":
                    return a + b;

                case "-":
                    return a - b;

                case "*":
                    return a * b;

                case "/":
                    return a / b;

                default:
                    throw new Exception();

                    //System.out.println("Операция не распознана. Повторите ввод.");

            }
        } else {

            throw new Exception("Введенное число не удовлетворяет условиям");
        }
    }
}
