
public class star_6 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i = 1;
		int j = 1;
		
		while(i<6){
			if(i+j < 6) {
				System.out.print(" ");
				j += 1;
			}else if(i+j >= 6) {
				System.out.print("*");
				j += 1;
				if (j == 6) {
		    		System.out.println();
		    		i += 1;
		    		j = 1;
				}
			}	    	
		}


	}

}
