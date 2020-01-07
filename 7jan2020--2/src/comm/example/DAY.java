package comm.example;

public enum DAY 
{

	SUN("Today is holiday:",1),
	MON("Today is monday:",2),
	TUE("Today is tuesday:",3),
	WED("Today is wednesday:",4),
	THU("Today is thursday:",5),
	FRI("Today is friday:",6),
	SAT("Today is holiday:",7);
	
	private final String day;
	private final int dayNum;
	
	private DAY(String n, int r) {

		dayNum = r;
		day = n;
	}
	public String getDay() {
		return day;
	}

	public int getDayNum() {
		return dayNum;
	}
}
