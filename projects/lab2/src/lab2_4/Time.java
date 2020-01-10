package lab2_4;

public class Time implements Comparable<Time>{
public int hour,minute,seconds,standardH;
public Time(int h,int m,int s) {
this.hour=h;
this.minute=m;
this.seconds=s;
if(h>=0&&h<=24)
{
	hour=h;
}
else 
	{
	System.out.print("Invalid input");
	}
if(m>=0&&h<=60) 
{
	minute=m;
}
else 
	{
	System.out.print("Invalid input");
	}
if(s>=0&&s<=60) 
{
	seconds=s;
}
else 
	{
	System.out.print("Invalid input");
	}
}
public int getHour() {
	return hour;
}

public void setHour(int hour) {
	this.hour = hour;
}

public int getMinute() {
	return minute;
}

public void setMinute(int minute) {
	this.minute = minute;
}

public int getSecond() {
	return seconds;
}

public void setSecond(int second) {
	this.seconds = second;
}

public String toUniversal()
{
	hour%=24;
	minute%=60;
	seconds%=60;
	return String.format("%02d:%02d:%02d", hour,minute,seconds)+ "    ";
	
}
public String toStandart()
{
	hour%=24;
	minute%=60;
	seconds%=60;
	if(hour>=12) {
		standardH=hour-12;
		return String.format("%02d:%02d:%02d", standardH,minute,seconds)+ " "+"PM";
	}
	else 
	{
		standardH=hour;
		return String.format("%02d:%02d:%02d", standardH,minute,seconds)+ " "+"PM";
		}
}
	
	

public void Add(Time t2) {
	hour%=24;
	hour+=t2.hour;
	minute%=60;
	minute+=t2.minute;
	seconds%=60;
	seconds+=t2.seconds;
	if(seconds>60) {
		minute++;
		
	}
	
	if(minute>60) {
		hour++;
	}
}
public int compareTo(Time t) {
	if(t.getHour() > getHour()) {
		return 1;
	} else if(t.getHour() < getHour()){
		return -1;
	} else {
		return 0;
	}
}
}
