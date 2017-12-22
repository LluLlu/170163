import java.io.*;
import java.utiil.Scanner;

public class TsetScanner{
	public static void main(Strinig[] args){
		try{
			FileWriter fw = new FileWriter("data.txt")
			BufferedWriter bw = new BufferedWriter(fw);
			String userData = "";

			while(true){
				System.out.println("imput msg>");
				userData = new Scanner(System.in).nextLine();

				if(userData.equals("exit")) break;
				bw.write(userData+"\n");
			}
			bw.close();
		}catch(IOException e){
			System.out.println("missss lolol");
		}
	}
}