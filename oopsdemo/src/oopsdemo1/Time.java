package oopsdemo1;
/* Java program to perform add of 2 times
 * t1 --> 12:45:55
 * t2 --> 10:30:30
 * t1+t2
 * if sec>60.. mins should be incremented & sec-60
 * if min>60.. hrs should be incremented & min-60
 */
public class Time {
	int hrs,min,sec;
	Time()
	{
		hrs=min=sec=0;
	}
    Time(int h,int m,int s){
    	hrs=h;
    	min=m;
    	sec=s;
    	
    }
    void add(Time t) {
    	
    	this.hrs+=t.hrs;
		this.min+=t.min;
		this.sec+=t.sec;
		if(this.sec>=60) {
			this.sec=this.sec-60;
			this.min+=1;
		}
		if(this.min>=60) {
			this.min=this.min-60;
			this.hrs+=1;
		}
		// System.out.println(hrs+"");
		}
    
    void display() {
    	System.out.println(this.hrs+"h" +this.min+"m" +this.sec+"s");
    }
}
