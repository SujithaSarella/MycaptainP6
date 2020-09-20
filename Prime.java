import java.util.Scanner;
public class  Prime {

    public static void main(String[] args) {

    int temp;
	boolean isPrime=true;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please insert any number:");
	int num=sc.nextInt();
    sc.close();
	for(int i=2;i<=num/2;i++)
	{
        temp=num%i;
	    if(temp==0)
	    {
	      isPrime=false;
	      break;
	    }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}