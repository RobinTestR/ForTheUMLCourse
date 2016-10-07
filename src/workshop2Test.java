import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import Model.Boat;
import Model.Member;
import View.Console;

import static org.junit.Assert.*;


public class workshop2Test {

	Model.Member member = new Member();
	View.Console console = new Console();
	Model.Boat boats = new Boat();
	ArrayList<String>test = new ArrayList<String>();

	@Before
	public void setUp() throws Exception {




	}

	@Test
	public void test() throws FileNotFoundException {

		member.setName("RandomName");
		member.memberInfo.add(member.getName());
		assertEquals(member.memberInfo.get(0), "RandomName");

		File readMemberData = new File("C:\\Users\\Robin\\Desktop\\MemberInfo.txt");
		File readBoatData = new File("C:\\Users\\Robin\\Desktop\\BoatInfo.txt");

		Scanner searchMemberData = new Scanner(readMemberData);
		Scanner searchBoatData = new Scanner(readBoatData);

		while(searchMemberData.hasNextLine()){
			int commaCounter = 0;
			String temp = "";
			String tempLine = searchMemberData.nextLine();
			for(int i = 0 ;i < tempLine.length();i++){
				if(tempLine.charAt(i)==','&& commaCounter == 0){
					String tempName = temp;
					member.memberInfo.add(tempName);
					temp = "";
					commaCounter++;
					i++;
				}
				if(tempLine.charAt(i)==','&& commaCounter == 1){
					String tempPID = temp;
					member.memberInfo2.add(tempPID);
					temp = "";
					commaCounter++;
					i++;
				}
				if(tempLine.charAt(i)==','&& commaCounter == 2){
					String tempMID = temp;
					member.memberInfo3.add(Integer.parseInt(tempMID));
					temp = "";
					commaCounter++;
					i++;
				}
				if(tempLine.charAt(i)==';'&& commaCounter == 3){
					String tempNumofBoat = temp;
					member.numOfBoats.add(Integer.parseInt(tempNumofBoat));
					temp = "";
					commaCounter++;
					i++;
				}
				else{
				  temp = temp+tempLine.charAt(i);
				}
			}

		}


		while(searchBoatData.hasNextLine()){

			int commaCounter = 0;

			String temp2 = "";
			String tempLine1 = searchBoatData.nextLine();
			for(int i = 0; i < tempLine1.length(); i++){

				if(tempLine1.charAt(i) == ',' && commaCounter == 0){

					String tempMID1 = temp2;

					boats.memberID.add(Integer.parseInt(tempMID1));
					temp2 = "";
					commaCounter++;
					i++;
				}

				if(tempLine1.charAt(i) == ',' && commaCounter == 1){

					String tempPID = temp2;
					boats.boatID.add(Integer.parseInt(tempPID));
					temp2 = "";
					commaCounter++;
					i++;

				}

				if(tempLine1.charAt(i) == ',' && commaCounter == 2){

					String tempAgain = temp2;
					boats.typeOfBoats.add(tempAgain);
					temp2 = "";
					commaCounter++;
					i++;

				}


				/*if(tempLine1.charAt(i) == ',' && commaCounter == 3){

					String tempAgain2 = temp2;
					boats.boatID.add(Integer.parseInt(tempAgain2));
					temp2 = "";
					commaCounter++;
					i++;

				}*/


				else{

					temp2 = temp2 + tempLine1.charAt(i);
				}

				}


			}

			assertEquals(member.memberInfo.get(1), "a");











	}

}
