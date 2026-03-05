import java.util.Scanner;
import Affirmations.AffirmationGenerator;
import java.util.Random;

public class AffirmationGenerator {

	private static final String[] AFFIRMATIONS = {
			"I am capable of mastering any subject I commit to.",
	        "My hard work today will influence the success of tomorrow.",
	        "I approach challenges with curiosity, not fear.",
	        "I am organized, focused, and ready to learn.",
	        "My mind absorbs information with clarity and ease.",
	        "I am more than my grades; my worth is infinite.",
	        "I give myself permission to rest without guilt.",
	        "I trust my ability to manage my time wisely.",
	        "I am resilient in the face of academic pressure.",
	        "I release the need for perfection and embrace progress.",
	        "I am proud of how far I’ve come in my education.",
	        "I can adapt to new situations with confidence.",
	        "My efforts are planting seeds for lifelong success.",
	        "I choose to focus on solutions, not problems.",
	        "I am calm, centered, and in control of my emotions.",
	        "I am capable of balancing my studies and my well-being.",
	        "I learn from mistakes and use them to grow stronger.",
	        "I am surrounded by opportunities to learn and improve.",
	        "I am patient with myself during stressful times.",
	        "I am worthy of academic and personal success.",
	        "I trust the process of learning, even when it feels slow.",
	        "I am confident in my ability to meet deadlines.",
	        "I am grateful for the education I am receiving.",
	        "I am capable of asking for help when I need it.",
	        "I choose to see exams as opportunities to showcase my knowledge.",
	        "I am in control of my study habits and my mindset.",
	        "I release tension from my body and mind with each breath.",
	        "I am proud of my persistence and dedication.",
	        "I am creating a balanced life that supports my goals.",
	        "I believe in myself and my ability to succeed in college."
	   };
	public static String getRandomAffirmation() {
		Random rand = new Random();
	    return AFFIRMATIONS[rand.nextInt(AFFIRMATIONS.length)];
	}

	public static void printAffirmation() {
	    System.out.println("✨ Affirmation of the Day ✨");
	    System.out.println(getRandomAffirmation());
	    System.out.println();
	}
}
