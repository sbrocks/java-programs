import java.util.*;
class student{
	int roll;
	String name;
	int marks;
	void inputdetails(int r,String nm,int m){
		roll=r;
		name=nm;
		marks=m;
	}
	void printdetails(){
		System.out.println("name:  "+name);
		System.out.println("roll:  "+roll);
		System.out.println("marks:  "+marks);
	}
}

class studentdetails{
	public static void  main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no.:");
		int ro=sc.nextInt();
		System.out.println("enter name: ");
		String str=sc.next(); 
		System.out.println("enter marks: ");
		int totalmarks=sc.nextInt();

		student s1=new student();
		s1.inputdetails(ro,str,totalmarks);
		s1.printdetails();
		
		
		System.out.println("enter roll no.:");
		ro=sc.nextInt();
		System.out.println("enter name: ");
		str=sc.next(); 
		System.out.println("enter marks: ");
		totalmarks=sc.nextInt();

		student s2=new student();
		s2.inputdetails(ro,str,totalmarks);
		s2.printdetails();
		System.out.println("-----------check marks-------------");
		if(s2.marks>s1.marks){
			s2.printdetails();
		}else{
			s1.printdetails();
		}


	}


}