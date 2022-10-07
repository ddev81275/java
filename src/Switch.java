public class Switch {
    static int OperationOn2ValueByOperator(int firstValue, int secondValue, char operator) {
        int summa = 0;
        switch (operator) {
            case '+':
                summa = firstValue + secondValue;
                break;
            case '-':
                summa = firstValue - secondValue;
                break;
            case '*':
                summa = firstValue * secondValue;
                break;
            case '/':
                summa = firstValue / secondValue;
                break;
            default:
                return summa;
        }
        return summa;
    }
}
