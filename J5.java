import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class J5{
    public static void main(String[] args)throws FileNotFoundException{
 	 File f1 = new File("in2.txt");
 	 Scanner sc1 = new Scanner(f1);
	 String s1= sc1.nextLine();
	 String[] arr1 = s1.split(",");
	 int num1= Integer.parseInt(arr1[0]);
	 int num2= Integer.parseInt(arr1[1]);
	 int sum1 = num1+num2;
	 System.out.println(sum1);}}
 	 
	 