package star_patterns;

public class HollowPyramid {
  	public static void main(String[] args) {
		int n=5;
		System.out.println("Triangle Hollow");
		for(int i=1;i<=5;i++) {
			if(i==1) {
				System.out.print("* ");
			}else if(i==n) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			}else {
				System.out.print("* ");
				for(int j=1;j<=i-2;j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Pyramid Hollow");
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
				System.out.print("  ");
			}
			if(i==1) {
				System.out.print("* ");
			}else if(i==n) {
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("* ");
				}
			}else {
				System.out.print("* ");
				for(int j=1;j<=2*i-3;j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Inverted Pyramid Hollow");
		for(int i=n;i>=1;i--) {
			for(int s=1;s<=n-i;s++) {
				System.out.print("  ");
			}
			if(i==1) {
				System.out.print("* ");
			}else if(i==n) {
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("* ");
				}
			}else {
				System.out.print("* ");
				for(int j=1;j<=2*i-3;j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
