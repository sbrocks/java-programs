
import java.util.*;

class time{
	int hour;
	int min;
	int sec;
	void input(int h, int m,int s){
		hour=h;
		min=m;
		sec=s;
	}
	void inputObject(time t){
		hour=t.hour;
		min=t.min;
		sec=t.sec;
	}
	void display(){
		System.out.println("time is:  "+hour+" hours "+min+" min "+sec+" sec ");
	}
}

class projtime{
	public static void main(String args[]){
		time t1=new time();
		time t2=new time();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter hours: ");
		int h=sc.nextInt();
		System.out.print("enter minutes: ");
		int m=sc.nextInt();
		System.out.print("enter secs: ");
		int s=sc.nextInt();
		t1.input(h,m,s);
		t1.display();
		t2.inputObject(t1);
		t2.display();
	}
}