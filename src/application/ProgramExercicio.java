package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ProgramExercicio {
	
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:SS");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New zealand",
				"I'm going to visit this worderful country!",
				12);
		p1.addComent(c1);
		p1.addComent(c2);
		
	    Comment c3 = new Comment("Good night");
	    Comment c4 = new Comment("May the Force be with you");
	    Post p2 = new Post(
	    		sdf.parse("28/07/2018 23:14:19"),
	    		"Good night guys",
	    		"See you tomorrow",
	    		5);
	    p2.addComent(c3);
	    p2.addComent(c4);
	 
	    System.out.println(p1);
	    System.out.println(p2);
	}

}
