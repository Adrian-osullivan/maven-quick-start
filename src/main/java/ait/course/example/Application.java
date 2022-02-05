package ait.course.example;
import java.util.*;
public class Application {
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

	}	
}