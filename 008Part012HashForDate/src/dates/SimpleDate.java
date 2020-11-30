package dates;

public class SimpleDate {
	int day;
	int month;
	int year;
	
	
	
	public SimpleDate(int day, int month, int year) {
		// TODO Auto-generated constructor stub
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean equals(SimpleDate comparedObject) {
	    if (this == comparedObject) {
	        return true;
	    }

	
	   if (!(comparedObject instanceof SimpleDate)) {
	        return false;
	    }

	   SimpleDate comparedBook = (SimpleDate) comparedObject;

	     if (this.day==(comparedBook.day) &&
	        this.month == comparedBook.month &&
	        this.year==comparedBook.year) {
	        return true;
	    }

	    return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}

