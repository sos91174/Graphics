
public class star_5 {

	public static void main(String[] args) {
		   
	    for(int i=0;i<11;i++)
	    {   if(i==6||i==10)
	    System.out.println("**************");
	    if(i>6&&i<10)
	    System.out.println("*            *");
	    if(i<5)
	    {
	   
	    for(int j=0;j<4-i;j++)
	    {
	    System.out.print(" ");
	    }
	       System.out.print("*****");
	     for(int k=0;k<2*i;k++)
	    {
	    System.out.print(" ");
	    }
	       System.out.println("*");
	   
	    }
	   
	    }
	    }

}
