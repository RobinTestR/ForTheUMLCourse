/**
 *
 */
package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

/**
 * @author Robin
 *
 */
public class DataCollector {
	static DataCollector data = new DataCollector();

	/*public static void main(String[] args){

		try {
			data.readMemberData();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}*/

	public void readMemberData() throws IOException{
		Member member = new Member();
		Boat boat = new Boat();
		PrintWriter writeMemberData = new PrintWriter("C:\\Users\\Robin\\Desktop\\MemberInfo.txt");

		try {



			for(int i = 0; i < member.memberInfo.size(); i++){


				String temp = "Name: " + member.memberInfo.get(i) + " MemberID: " + member.memberInfo2 + " PersonalNumber: " + member.memberInfo3 +"";

				writeMemberData.println("lolie");

			}


		}catch(NoSuchElementException e){

			System.out.println("Sorry, that file is not an option");

		}finally{

			writeMemberData.close();
		}


	}





}
