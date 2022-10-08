public class Main {
    public static void main(String[] args) {
        int userOld = 21;
        float userHeight = 180.8F;//sm

        String workDays[] = new String[]{"Mn", "Tu", "We", "Th", "Fi"};
        int numbers[] = {1, 2, 3, 4, 5};
        int doubleMatrix[][] = {{1, 2}, {3, 4}};
        int a = 2, b = 3;
        int summaOf2Values = a + b;

        System.out.println("user old is " + userOld + ", user height: " + userHeight + ", please input anything");
        System.out.println(numbers[0] + " " + workDays[0]);
        System.out.println(numbers[1] + " " + workDays[1]);
        System.out.println(numbers[2] + " " + workDays[2]);
        System.out.println(numbers[3] + " " + workDays[3]);
        System.out.println(numbers[4] + " " + workDays[4]);

        System.out.println(a + " + " + b + " = " + summaOf2Values);
        System.out.println(doubleMatrix[0][0]);
        System.out.println(doubleMatrix[1][1]);

        Boolean isTrue = Conditions.SpeedChecker(12, 3);
        System.out.println(isTrue);

        double mark = 89.7d;
        String alphaMark = Conditions.ShowAlphaSignByValue(mark);
        System.out.println(alphaMark);

        System.out.println(Switch.OperationOn2ValueByOperator(12, 12, '*'));
        System.out.println(Switch.OperationOn2ValueByOperator(8, 2, '/'));
        System.out.println(Switch.OperationOn2ValueByOperator(11, 2, '+'));
        System.out.println(Switch.OperationOn2ValueByOperator(80, 30, '-'));
        System.out.println(Switch.OperationOn2ValueByOperator(80, 30, ' '));

        Loop.DoWhilePrint();
        Loop.WhilePrint();
        Loop.ForPrint();
    }
}