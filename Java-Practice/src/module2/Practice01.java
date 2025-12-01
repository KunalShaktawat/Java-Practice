package module2;
// Q.1 Given an array of marks of students if the marks of any students is less than 35, prints its roll no.[roll number here refers to the index of the array]
public class Practice01 {
	public static void main(String[] args) {
		int marks[]= {40,67,25,30,10,80,18};
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<35) {
				System.out.println("Roll no. :"+i+" Marks :"+marks[i]);
			}
		}
	}

}
