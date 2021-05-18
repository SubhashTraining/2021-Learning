package IterfaceChallenge;

import java.util.ArrayList;

public class Team {
	
	private String name;
	private int played=0;
	private int won=0;
	private int lost =0;
	private int tied =0;
	
	private ArrayList<player> members = new ArrayList<>();
	
	public Team(String name)
	{
		this.name=name;
	}
	
	public boolean addTeamMember(player member){
		
		if(this.members.contains(member))
		{
			System.out.println("Member already Available");
			return false;
		}
		else
		{
			members.add(member);
			System.out.println("Player "+member.getName()+" is picked for the team "+this.name);
			return true;
		}
		
	}
	
	public int noOfPlayers()
	{
		return this.members.size();
	}

	public void matchResults(Team opponent, int ourScore, int theirScore)
	{
		if(ourScore> theirScore)
		{
			this.won++;
		}
		else if(ourScore==theirScore)
		{
			this.tied++;
		}
		else
		{
			this.lost++;
		}
		if(opponent!=null)
		{
			matchResults(null,theirScore, ourScore);
		}
	}
	
	public int Ranking()
	{
		return this.won*2+this.tied;
	}
	
	
}
