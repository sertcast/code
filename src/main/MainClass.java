package main;
import hsa.Console;
public class MainClass {
	static Console c;
	static boolean running = true;
	static char selection = ' ';
	static int input;
	static String inCode;
	final static String code[][] = {
			{"a", "b", "c"},
			{"d", "e", "f"},
			{"g", "h", "i"},
			{"j", "k", "l"},
			{"m", "n", "o"},
			{"p", "q", "r", "s"},
			{"t", "u", "v"},
			{"w", "x", "y", "z"},
	};
	public static void main(String[] args) {
		c = new Console();
		do {
			c.print("send or recieve?(s/r) ");
			selection = c.readChar();
			while(selection != 's' && selection != 'r') {
				c.print("send or recieve?(s/r) ");
				selection = c.readChar();
			}
			if(selection == 'r') {
				c.print("enter the code: ");
				input = c.readInt();
				
			}
		}while(running);

	}

}
