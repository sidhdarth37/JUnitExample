
public class Player {

	int pid;
	String name;
	int num;
	
	public Player(int pid, String name, int num) {
		super();
		this.pid = pid;
		this.name = name;
		this.num = num;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
