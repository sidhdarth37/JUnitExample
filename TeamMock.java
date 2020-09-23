import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
public class TeamMock {
	Team team;
	ScoreService ss;
	
	public void setTeam()
	{
		team=new Team();
		ss=mock(ScoreService.class);
		team.setS(ss);
	}
	
	public boolean test()
	{
		List<Player> pl=new ArrayList<>();
		Player p1=new Player(10, "A", 12);
		pl.add(p1);
		team.setList(pl);
		when(ss.getScore(p1)).thenReturn(100);
		int ttl=team.getTotal();
		if(ttl==110)
			return true;
		return false;
	}
	
	public static void main(String[] args)
	{
		TeamMock tm=new TeamMock();
		tm.setTeam();
		boolean b=tm.test();
		System.out.println(b);
	}
}
