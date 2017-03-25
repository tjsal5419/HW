package hw;

public class Seat {
	int group;
	int seatIndex;
	String userName;

	public Seat(int group, int seatIndex, String userName) {
		this.group = group;
		this.seatIndex = seatIndex;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
