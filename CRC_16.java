import java.io.*;
import java.util.*;

public class CRC_16 {

    public static void main(String args[]) {
    
Scanner sc = new Scanner(System.in);
    System.out.print("Enter message bits: ");
    String m = sc.nextLine();
    System.out.println("\nEnter \n1 for CRC 12\n2 for CRC 16\n3 for CRC CCITT");
    int choice=sc.nextInt();
    String generator="";
    if(choice==1){
        generator="1100000001111";
    }
    if(choice==2){
        generator="11000000000000101";
    }
    if(choice==3){
        generator="10001000000100001";
    }
int information[] = new int[m.length() + generator.length() - 1];
int divisor[] = new int[generator.length()];
for(int i=0;i<m.length();i++)
	information[i] = Integer.parseInt(m.charAt(i)+"");
for(int i=0;i<generator.length();i++)
	divisor[i] = Integer.parseInt(generator.charAt(i)+"");
for(int i=0;i<m.length();i++)
{
	if(information[i]==1)
		for(int j=0;j<divisor.length;j++)
			information[i+j] ^= divisor[j];
}


System.out.print("The checksum code is: ");
for(int i=0;i<m.length();i++)
	information[i] = Integer.parseInt(m.charAt(i)+"");
for(int i=0;i<information.length;i++) 
    System.out.print(information[i]);
System.out.println();

}
}
