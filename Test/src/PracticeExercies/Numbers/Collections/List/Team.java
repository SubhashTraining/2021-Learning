package PracticeExercies.Numbers.Collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Team <T extends Player> implements Comparable<Team<T>>{

	private String TeamName;
	private List<T> TeamPlayers;
	private int ranking;
	
	public void setRanking(int rank)
	{
		this.ranking=rank;
	}
	
	public int getRank()
	{
		return this.ranking;
	}
	
	
	public Team(String TeamName)
	{
		this.TeamName=TeamName;
		this.TeamPlayers= new LinkedList<>();
	}
	
	public boolean addPlayer(T Player)
	{
		
		if(TeamPlayers.contains(Player))
		{
			return false;
		}
		TeamPlayers.add(Player);
		return true;
		
	}
	
	public boolean removePlayer(T Player)
	{
		if(TeamPlayers.contains(Player))
		{
			TeamPlayers.remove(TeamPlayers.indexOf(Player));
			return true;
		}
		return false;
		
	}

	@Override
	public int compareTo(Team<T> team) {
		// TODO Auto-generated method stub
		
		return Integer.valueOf(this.getRank()).compareTo(Integer.valueOf(team.getRank()));
	}

	public String getTeamName() {
		return TeamName;
	}

	public List<T> getTeamPlayers() {
		return new LinkedList<>(TeamPlayers);
	}

	public int getRanking() {
		return ranking;
	}

	
	
	
	
	
	
	
}
