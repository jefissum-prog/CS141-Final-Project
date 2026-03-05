public class Recommendations {

    public static void showRecommendations(int testCounter) {
        if (testCounter == 0) {
            System.out.println("You must take the Mental Health Quiz first for personalized recommendations.");
            return;
        }

        System.out.println("Personalized Recommendations");
        
        System.out.println("Stress (" + MentalHealthQuiz.stressScore + "/15):");
        printStressTips(MentalHealthQuiz.stressScore);
        System.out.println();

        System.out.println("Anxiety (" + MentalHealthQuiz.anxietyScore + "/15):");
        printAnxietyTips(MentalHealthQuiz.anxietyScore);
        System.out.println();

        System.out.println("Depression (" + MentalHealthQuiz.depressionScore + "/15):");
        printDepressionTips(MentalHealthQuiz.depressionScore);
        System.out.println();

        System.out.println("Please note, this should not be taken as real medical advice. This is for simulation purposes!");
    }

    private static void printStressTips(int score) {
        if (score <= 5) {
            System.out.println("Continue what you are doing. Take breaks and take short walks when you begin to feel stress.");
        } else if (score <= 10) {
            System.out.println("When you notice intense stress, inhale through your nose, take a second short inhale, then a slow and long");
            System.out.println("exhale through your mouth. Repeat this as many times as you need.");
        } else {
        	System.out.println("Consider reaching out to a counselor for support.");
        }
    }

    private static void printAnxietyTips(int score) {
        if (score <= 5) {
            System.out.println("Keep doing what is working! Pracice turning anxious thoughts positive.");
        } else if (score <= 10) {
            System.out.println("Stop the avoidance cycle. Whatever you are putting off, practice small exposure.");
        } else {
        	System.out.println("Consider reaching out to a counselor for support.");
        }
    }

    private static void printDepressionTips(int score) {
        if (score <= 5) {
            System.out.println("When you notice depressive thoughts, move your body, take a short walk, or stretch.");
        } else if (score <= 10) {
            System.out.println("Reach out to a friend, fight isolation. Focus on building consistency in an area like sleep or eating.");
        } else {
        	System.out.println("Consider reaching out to a counselor for support.");
        }
    }
}
