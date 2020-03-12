//author = Edi Irawan
//problem 3
import java.util.Scanner;
public class Evenparity {
    public static void main(String[] args) {

        System.out.println("This program is a language for L = {w | w∈ {0,1}: w has even parity}");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please insert binary (0,1) : ");
        String n = scan.nextLine();

        //declare the range size
        if(n.length()> 10) {
            System.out.println("Invalid input range. Please try again.");
        }

        else
        {
           
            //convert n string to char array
            char[] c = n.toCharArray();
            char F = 'x';

            //algorthm for the language
            for(int i=0;i<n.length();i++){
            switch(F)
    {
    case 'y':   if(c[i]=='0') F='y';
                else if(c[i]=='1') F='x';
                break;

    case 'x':   if(c[i]=='0') F='x';
                else if(c[i]=='1') F='y';
                break;

    }

    }
        //result final state
        if(F=='x') System.out.println("Accepted");
            else System.out.println("Rejected");
        }
    }
}