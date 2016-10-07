import java.io.IOException;

import View.Console;

/**
 *
 */

/**
 * @author Robin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	static View.Console startConsole = new View.Console();
	public static void main(String[] args) {


		try {
			startConsole.start();
		} catch (IOException e) {

			e.printStackTrace();
		}


	}



}
