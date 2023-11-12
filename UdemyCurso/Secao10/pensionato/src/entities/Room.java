package entities;

public class Room {
	private String name;
	private String email;
	private int room_num;
	
	public Room(String name, String email, int room_num) {
		this.name = name;
		this.email = email;
		this.room_num = room_num;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom_num() {
		return room_num;
	}

	public void setRoom_num(int room_num) {
		this.room_num = room_num;
	}
	
	public String toString() {
		return String.format("%d: %s, %s", room_num, name, email);
	}
}
