import java.util.List;

public class Team {
	ScoreService s;
	List<Player> list;
	public ScoreService getS() {
		return s;
	}
	public void setS(ScoreService s) {
		this.s = s;
	}
	public List<Player> getList() {
		return list;
	}
	public void setList(List<Player> list) {
		this.list = list;
	}
	public int getTotal()
	{
		int total=0;
		for(Player p : list)
		{
			total+=s.getScore(p);
		}
		return total;
	}
}
