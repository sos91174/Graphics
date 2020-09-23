public class triangle{
    public static void main(String args[]) {
		   System.out.println("畫三角形");
		   int count = 12; //設定colum次數(直的)
		   triangle(count);	//呼叫triangle方法
		   System.out.println("已完成!");
    }

		
		
    public static void triangle(int count){
		    int i,j,k;	//宣告變數
		
			for (i=1; i<=count; i++){//for迴圈colum(直的)總共有count個colum
		  		for(k=1;k<=(count-i)/2;k++){//列印遞減的空白,(count-i)/2是在每一個row中總共會列印count次(不論空白或*號)減掉*個數後,是全部空格的數量,除二是放*前面的數量
					System.out.print(" ");	//印出空白
				}
		  
		   		if(i%2!=0){//奇數列
		  		 	for (j=1; j<=i; j++){//列印*號成三角形	
		 				    System.out.print("*");//印出*
			  		}		System.out.println(); 
					}else{System.out.println();}//偶數列換行
				}	
	
	}
}