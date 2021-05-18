package PracticeExercies.Numbers.Collections.List;

import java.util.Collections;
import java.util.List;

public class list {
	
	public static void main(String[] args)
	{
		
		//Array and ArrayList (Dynamic growing arrays) are expensive - removing items in between - perform shift
		//Linked list - Iterator and ListIterator(Back and front - addition and removal)
		
		FootBallPlayer Player1 = new FootBallPlayer("Player1");
		FootBallPlayer Player2 = new FootBallPlayer("Player2");
		FootBallPlayer Player3 = new FootBallPlayer("Player3");
		
		CricketPlayer Cricket1 = new CricketPlayer("Cricket1"); 
		CricketPlayer Cricket2 = new CricketPlayer("Cricket2"); 
		CricketPlayer Cricket3 = new CricketPlayer("Cricket3"); 
		
		BasketBallPllayer BasketBallPllayer1 = new BasketBallPllayer("BasketBallPllayer1");
		BasketBallPllayer BasketBallPllayer2 = new BasketBallPllayer("BasketBallPllayer2");
		BasketBallPllayer BasketBallPllayer3 = new BasketBallPllayer("BasketBallPllayer3");
		BasketBallPllayer BasketBallPllayer4 = new BasketBallPllayer("BasketBallPllayer4");
		
		
		Team<BasketBallPllayer> AmericanBasketBallTeam = new Team("American Basket Ball Team");
		Team<BasketBallPllayer> IndianBasketBallTeam = new Team("Indian Basket Ball Team");
		
		AmericanBasketBallTeam.addPlayer(BasketBallPllayer1);
		AmericanBasketBallTeam.addPlayer(BasketBallPllayer2);
		AmericanBasketBallTeam.addPlayer(BasketBallPllayer2);
		
		IndianBasketBallTeam.addPlayer(BasketBallPllayer3);
		IndianBasketBallTeam.addPlayer(BasketBallPllayer4);
		
		IndianBasketBallTeam.setRanking(100);
		AmericanBasketBallTeam.setRanking(10);
		
		System.out.println(IndianBasketBallTeam.equals(AmericanBasketBallTeam));		
		
		List<BasketBallPllayer> linkedList =  IndianBasketBallTeam.getTeamPlayers();//Check the generic type here. since we are returning Basket ball playes
		// the List<T> should be List<BasketBallPalyer>
		linkedList.forEach(i->System.out.println(i.getName()));
		//BasketBallPllayer3
		//BasketBallPllayer4
		
		
		Collections.reverse(linkedList);
		linkedList.forEach(i->System.out.println(i.getName()));
		//BasketBallPllayer3
		//BasketBallPllayer4
		
		
		
	}

}
