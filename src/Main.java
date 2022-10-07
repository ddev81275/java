public class Main {
    public static void main(String[] args) {
        int userOld = 21;
        float userHeight = 180.8F;//sm
        double userWeight = 62.6D;//kg

        Boolean isWorkDay = false;
        String name = "Dear, User";
        String workDays[] = new String[]{ "Mn", "Tu", "We", "Th", "Fi" };
        int numbers[] = {1, 2, 3, 4, 5};

        System.out.println("user old is " + userOld + ", user height: " + userHeight + ", please input anything");
        System.out.println(numbers[0] + " " + workDays[0]);
        System.out.println(numbers[1] + " " + workDays[1]);
        System.out.println(numbers[2] + " " + workDays[2]);
        System.out.println(numbers[3] + " " + workDays[3]);
        System.out.println(numbers[4] + " " + workDays[4]);
    }
}