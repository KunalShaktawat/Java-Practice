package star_patterns;

public class HollowAlpha {
	public static void main(String[] args) {
		int n=5;
		
		System.out.println("Hollow Triangle A");
		for(int i=1;i<=n;i++) {
			if(i==1) {
				System.out.print("A ");
			}else if(i==n) {
				for(int j=1;j<=n;j++) {
					System.out.print("A ");
				}
			}else {
				System.out.print("A ");
				for(int j=1;j<=i-2;j++) {
					System.out.print("  ");
				}
				System.out.print("A ");
			}
			System.out.println();
		}
		
		System.out.println("Hollow Pyramid A");
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
				System.out.print("  ");
			}
			if(i==1) {
				System.out.print("A ");
			}else if(i==n) {
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("A ");
				}
			}else {
				System.out.print("A ");
				for(int j=1;j<=2*i-3;j++) {
					System.out.print("  ");
				}
				System.out.print("A ");
			}
				System.out.println();
		}
	}

}
