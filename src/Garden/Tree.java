package Garden;

import java.util.*;

import org.junit.experimental.theories.Theories;

public class Tree {
	private String treeName;
	private int age;
	private int cycle;
	private int stats;
	private int health;
	private int fruitNumber;
	private int rande;
	public Tree() {}
	public Tree(String treeName, int cycle) {
		this.treeName = treeName;
		this.age = 0;
		this.cycle = cycle;
		this.stats = 0;
		this.health = 5;
		this.fruitNumber = 0;
		this.rande = 0;
	}
	public void getWater()
	{
		stats ++;
	}
	public void sleepOneDay()
	{
		age++;
		if(age>cycle)
			age = 0;
		if(stats<=3)
			health--;
		else if(stats>3 && stats<=7)
			health++;
		else
		{
			if(rande<10)
				rande++;
		}
		int s = (int)(1+Math.random()*(10-1+1));
		if(s<=rande)
			fruitNumber++;
	}
	public boolean pickFruit()
	{
		if(fruitNumber>0)
		{
			fruitNumber --;
			return true;
		}
		else
			return false;
	}
	public String getTreeName() {
		return treeName;
	}
	public int getAge() {
		return age;
	}
	public int getCycle() {
		return cycle;
	}
	public int getStats() {
		return stats;
	}
	public int getHealth() {
		return health;
	}
	public int getFruitNumber() {
		return fruitNumber;
	}
	public int getRande() {
		return rande;
	}
	public void setName(String string, String treeName) {
		// TODO Auto-generated method stub
		this.treeName=treeName;
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
