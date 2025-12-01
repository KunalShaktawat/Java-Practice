package star_patterns;

public class AlphaPatterns {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)('A'+j-1));
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)('A'+i-1));
			}
			System.out.println();
		}
		int a=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)('A'+a));
				a++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Right Align");
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char) ('A'+j-1));
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Reverse alpha");
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)('A'+j-1));
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Revers aplha2");
		for(int i=n;i>=1;i--) {
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char) ('A'+j-1));
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pyramid aplha");
		for(int i=n;i>=1;i--) {
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print((char) ('A'+j-1));
			}
			System.out.println();
		}
		
	}
}
