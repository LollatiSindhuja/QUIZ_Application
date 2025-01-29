import java.util.*;

public class ApplicationforQUIZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //quiz questions
        String[] questions = {
                "1. What is the worlds largest desert?",
                "2. What do you call a fake noodle?",
                "3. Which river is the longest in south america?",
                "4. What is the largest planet in our solar system?",
                "5. who wrote the famous novel pride and prejudice?"
        };
        //options for the questions
        String[][] options = {
                { "a) godi", "b) sahara", "c) mojave", "d) atacama" },
                { "a) an impasta", "b) a noodle", "c) a fake noodle", "d) a spaghetti" },
                { "a) amazon river", "b) parana river", "c) sao francico river", "d) magdalena river" },
                { "a) earth", "b) saturn", "c) jupiter", "d) uranus" },
                { "a) jane austen", "b) charlesdickens", "c) j.k.rowling", "d) edgar allan poe" }
        };
        //correct answers for the questions
        char[] answers = { 'b', 'a', 'a', 'c', 'a' };
        int score = 0;
        System.out.println("Welcome to the Application of Quiz!");
        System.out.println("Answer the following questions by entering the choice (a, b, c, or d).");
        System.out.println("----------------------------------");

        for (int j = 0; j < questions.length; j++) {
            System.out.println(questions[j]);
            for (String option : options[j]) {
                System.out.println(option);
            }
            System.out.print("Your answer is: ");
            char userAnswer = sc.nextLine().toLowerCase().charAt(0);

            if (userAnswer == answers[j]) {
                System.out.println("Correct Answer!\n");
                score++;

            } else {
                System.out.println("Wrong Answer! The correct answer is " + answers[j] + ".\n");
            }
        }

        System.out.println("---------------------------------");
        System.out.println("The Quiz is finished! Your final score is: " + score + "/" + questions.length);

        if (score == questions.length) {
            System.out.println("Excellent! all your answers are right!");

        } else if (score >= questions.length / 2) {
            System.out.println("Good job! You passed the quiz.");

        } else {
            System.out.println("Better luck for the next time!");
        }
        sc.close();
    }
}