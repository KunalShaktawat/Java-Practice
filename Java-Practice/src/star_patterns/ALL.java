package star_patterns;

public class ALL {
	    public static void main(String[] args){
	          int n=5;
	          System.out.println("Left align");
	          for(int i=1;i<=n;i++){    
	             for(int j=1;j<=i;j++){
	                 System.out.print("*");
	             }
	             System.out.println();
	          }
	          System.out.println("Right align");
	          for(int i=1;i<=n;i++){
	             for(int s=1;s<=n-i;s++){
	                  System.out.print(" ");
	             }    
	             for(int j=1;j<=i;j++){
	                 System.out.print("*");
	             }
	             System.out.println();
	          }
	          System.out.println("Inverted Left align");
	          for(int i=n;i>=1;i--){    
	             for(int j=1;j<=i;j++){
	                 System.out.print("*");
	             }
	             System.out.println();
	          }
	          System.out.println("Inverted Right align");
	          for(int i=n;i>=1;i--){
	             for(int s=1;s<=n-i;s++){
	                  System.out.print(" ");
	             }   
	             for(int j=1;j<=i;j++){
	                 System.out.print("*");
	             }
	             System.out.println();
	          }
	          System.out.println("Pyramid");
	          for(int i=1;i<=n;i++){ 
	        	 for(int s=1;s<=n-i;s++) {
	        		 System.out.print(" ");
	        	 }
	             for(int j=1;j<=2*i-1;j++){
	                 System.out.print("*");
	             }
	             System.out.println();
	          }
	          
	          System.out.println("Invertrd Pyramid");
	          for(int i=n;i>=1;i--){
	             for(int s=1;s<=n-i;s++){
	                  System.out.print(" ");
	             }   
	             for(int j=1;j<=2*i-1;j++){
	                 System.out.print("*");
	             }
	             System.out.println();
	          }
	          
	    }
	    
}
