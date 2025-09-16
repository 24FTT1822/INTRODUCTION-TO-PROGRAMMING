import java.util.Scanner;

public class GuessBirthMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthBinaryValue = 0; 
        String birthMonthName = ""; 

        
        System.out.println("Is your birth month in Set 1?");
        System.out.println("1 3 5 7 9 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int answerSet1 = scanner.nextInt();
        if (answerSet1 == 1) {
            monthBinaryValue += 1;
        }

        
        System.out.println("Is your birth month in Set 2?");
        System.out.println("2 3 6 7 10 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int answerSet2 = scanner.nextInt();
        if (answerSet2 == 1) {
            monthBinaryValue += 2;
        }

        
        System.out.println("Is your birth month in Set 3?");
        System.out.println("4 5 6 7 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int answerSet3 = scanner.nextInt();
        if (answerSet3 == 1) {
            monthBinaryValue += 4;
        }

        
        System.out.println("Is your birth month in Set 4?");
        System.out.println("8 9 10 11 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int answerSet4 = scanner.nextInt();
        if (answerSet4 == 1) {
            monthBinaryValue += 8;
        }

        
        switch (monthBinaryValue) {
            case 1:
                birthMonthName = "January";
                break;
            case 2:
                birthMonthName = "February";
                break;
            case 3:
                birthMonthName = "March";
                break;
            case 4:
                birthMonthName = "April";
                break;
            case 5:
                birthMonthName = "May";
                break;
            case 6:
                birthMonthName = "June";
                break;
            case 7:
                birthMonthName = "July";
                break;
            case 8:
                birthMonthName = "August";
                break;
            case 9:
                birthMonthName = "September";
                break;
            case 10:
                birthMonthName = "October";
                break;
            case 11:
                birthMonthName = "November";
                break;
            case 12:
                birthMonthName = "December";
                break;
            default:
                birthMonthName = "an unknown month";
                break;
        }

        System.out.println("You are born in " + birthMonthName);

        scanner.close();

}
}

