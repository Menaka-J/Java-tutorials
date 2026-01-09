
import java.util.Scanner;

class bc_pro3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] questions = {"Which team has won most ICC ODI world cups?",
            "Who has won all ICC tournaments as captains?",
            "Who is the first batter to score a double century in ODI",
            "Which is the richest cricket board",
            "Who is called as Captain cool"};

        String[][] options = {
            {"1.India", "2.Australia", "3.England", "4.New Zealand"},
            {"1.Ricky Ponting", "2.Kapil Dev", "3.MS Dhoni", "4.Kumar Sangakara"},
            {"1.Sachin Tendulkar", "2.Sunil Gavaskar", "3.Don Bradman", "4.Viv Richards"},
            {"1.South Africa", "2.England", "3.India", "4.Pakistan"},
            {"1.MS Dhoni", "2.Ricky Ponting", "3.Virat Kohli", "4.Kapil Dev"}};

        int[] answers = {2, 3, 1, 3, 1};
        int score = 0;

        System.out.println("***********************");
        System.out.println("WELCOME TO QUIZ");
        System.out.println("***********************\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println();
            System.out.println(questions[i]);
            for (String ans : options[i]) {
                System.out.println(ans);
            }
            System.out.print("Enter your answer: ");
            int userchoice = scan.nextInt();
            if (userchoice == answers[i]) {
                score++;
            }
        }
        System.out.println("Your score is " + score + " out of 5");
        System.out.println("**********");
        System.out.println("BYE!!!");
        System.out.println("**********");

    }
}
