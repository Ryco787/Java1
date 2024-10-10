import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class J4{
    public static void main(String[] args)throws FileNotFoundException{
 	 File f1 = new File("in1.txt");
 	 Scanner sc1 = new Scanner(f1);
	 int num1 = sc1.nextInt();
	 int num2 = sc1.nextInt();
	 int sum1 = num1+num2;
	 System.out.println(sum1);}}
 	 
	 