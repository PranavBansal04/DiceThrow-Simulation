package assignment;

import java.util.Random;
import java.util.Scanner;

public class dicethrow {

	public static void main(String[] args) {
		
		System.out.println("*******************************************************************\r\n" + 
				"**********************Dice Statistics******************************\r\n" + 
				"*******************************************************************");
		
		System.out.println("This program will simulate dice rolls and calculate the percentages\r\n" + 
				"of each possible outcome. You input how many dice throws you'd like in\r\n" + 
				"each round. You can repeat and do another round, or quit when done.\r\n" + 
				"");
		
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		String choice;
		int round=1;
		
		do {
			System.out.println("How many dice throws do you want to do for Round #"+round+"? --> ");
			int n = sc.nextInt();
			while(n<0) {
				System.out.println("Dice throws must be greater than 0. Enter again: ");
				n=sc.nextInt();
			}
			int count_array[] = new int[11];
			for(int i=0;i<n;i++) {
				int d1 = 1+rand.nextInt(6);
				int d2 = 1+rand.nextInt(6);
				int d=d1+d2;
				switch(d) {
					case 2:
						count_array[0]+=1;
						break;
					case 3:
						count_array[1]+=1;
						break;
					case 4:
						count_array[2]+=1;
						break;
					case 5:
						count_array[3]+=1;
						break;
					case 6:
						count_array[4]+=1;
						break;
					case 7:
						count_array[5]+=1;
						break;
					case 8:
						count_array[6]+=1;
						break;
					case 9:
						count_array[7]+=1;
						break;
					case 10:
						count_array[8]+=1;
						break;
					case 11:
						count_array[9]+=1;
						break;
					case 12:
						count_array[10]+=1;
						break;
				}
					
						
			}
			System.out.println("Roll\tCount\tPct");
			for(int i=0;i<11;i++){
				float pct=((float)count_array[i]/n)*100;
				double per = Math.round(pct * 100.0) / 100.0;
				System.out.println((i+2)+"\t"+count_array[i]+"\t"+per+"%");
			}
			
			System.out.println("Would you like to run another simulation? Y/N --> ");
			choice=sc.next().toLowerCase();
			round+=1;
		}while(choice.equals("y"));
		System.out.println("Program ending. Have a fantastic day.");

	}

}
