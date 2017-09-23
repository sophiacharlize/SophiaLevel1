
 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String url = "http://www.eatfunfoods.com/img-SprinkleRainbow.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component image;
		// 3. use the "createImage()" method below to initialize your Component
image=createImage(url);
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog("Are sprinkles the most delicious food ever?");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Correct");
}
		// 8. print "INCORRECT" if the answer is wrong
if(answer.equals("no")) {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

		// 10. find another image and create it (might take more than one line of code)
String url2 = "http://cdn2-www.musicfeeds.com.au/assets/uploads/justin-bieber-2016-press-pic-supplied.jpg";
Component jb;
jb = createImage(url2);
		// 11. add the second image to the quiz window
quizWindow.add(jb);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String response = JOptionPane.showInputDialog("When was Justin Bieber born? (Month date and year)");
if(response.equals("March 1st 1994")) {
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}

