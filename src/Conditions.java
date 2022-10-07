import java.lang.management.BufferPoolMXBean;

public class Conditions {
    static Boolean SpeedChecker(int biggerValue, int lessValue) {
        if (biggerValue > lessValue) {
            return true;
        } else {
            return false;
        }
    }

    static String ShowAlphaSignByValue(double mark) {
        if (mark > 25 && mark <= 50) {
            return "D";
        } else if (mark > 50 && mark <= 75) {
            return "B";
        } else {
            return "A";
        }
    }
}