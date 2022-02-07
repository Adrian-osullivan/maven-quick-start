package ait.course.example;
import java.util.*;
import org.apache.commons.lang3.StringUtils;
public class Application {
	public int countWords (String words) {
		String[] separateWords = StringUtils.split(words,' ');
		return (separateWords == null)? 0 : separateWords.length;
	}
	public void greet() {
		ArrayList<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		for (String greeting : greetings) {
			System.out.println("Greeting: " + greeting);
		}

	}
	
	public Application () {
		System.out.println ("Inside Application");
	}

	public static void main(String[] args){
		System.out.println("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords("I have four words");
		System.out.print("Word count: " + count);

	}	
}