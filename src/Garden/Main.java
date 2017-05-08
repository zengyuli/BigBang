package Garden;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Tree[] trees = new Tree[10];
		for(int i = 0;i<10;++i)
			trees[i] = new Tree();
		int numberOfTree = 0;
		String[] WarehouseFruitName = new String[100];
		int [] WarehouseFruitStats = new int[100];
		int numberOfFruit = 0;
		System.out.println("welcome to the game,here you can choose:");
		int choose;
		int myStats = 0;
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("-------------------");
			System.out.println("0.exit");
			System.out.println("1.View plants");
			System.out.println("2.Plant");
			System.out.println("3.Water");
			System.out.println("4.Harvest");
			System.out.println("5.View warehouse");
			System.out.println("6.Sleep a day");
			System.out.print("input your choice:");
			choose = in.nextInt();
			if(choose==1)
			{
				if(numberOfTree==0)
				{
					System.out.println("No plant!");
					continue;
				}
				for(int i = 0;i<numberOfTree;++i)
				{
					System.out.println((i+1)+"."+trees[i].getTreeName());
					System.out.println("  age:"+trees[i].getAge()+"/"+trees[i].getCycle());
					System.out.println("  Health:"+trees[i].getHealth());
					System.out.println("  Stats:"+trees[i].getStats());
					System.out.println("  fruit:"+trees[i].getFruitNumber());
					System.out.println("  The Probability of fruit:"+(trees[i].getRande()*10)+"%");
				}
			}
			else if(choose==2)
			{
				System.out.print("Please input the name of tree:");
				in.nextLine();
				String treeName = in.nextLine();
				System.out.print("Please input the cycle of tree:");
				int treeCycle = in.nextInt();
				trees[numberOfTree++] = new Tree(treeName,treeCycle);
			}
			else if(choose==3)
			{
				if(numberOfTree==0)
				{
					System.out.println("No plant!");
					continue;
				}
				System.out.print("Please choose a plant to water(1-"+numberOfTree+"):");
				int nu = in.nextInt();
				trees[nu-1].getWater();
				System.out.println("Water sucessfully!");
			}
			else if(choose==4)
			{
				if(numberOfTree==0)
				{
					System.out.println("No plant!");
					continue;
				}
				System.out.print("Please choose a plant to harvest(1-"+numberOfTree+"):");
				int nu = in.nextInt();
				if(trees[nu-1].pickFruit())
				{
					WarehouseFruitName[numberOfFruit] = trees[nu-1].getTreeName();
					WarehouseFruitStats[numberOfFruit++] = trees[nu-1].getStats();
					System.out.println("Harvest sucessfully!");
				}
				else
					System.out.println("This plant has no fruit!");
			}
			else if(choose==5)
			{
				if(numberOfFruit==0)
				{
					System.out.println("No fruit exists!");
					continue;
				}
				System.out.println("You are in the warehouse now!");
				System.out.println("1.View all fruits");
				System.out.println("2.eat one");
				System.out.println("3.destroy one");
				System.out.println("please choose:");
				int chooseWarehouse = in.nextInt();
				if(choose==1)
				{
					System.out.println("Here are the fruits in the warehouse:");
					for(int i = 0;i<numberOfFruit;i++)
						System.out.println((i+1)+"."+WarehouseFruitName[i]+" stats:"+WarehouseFruitStats[i]);
				}
				else if(choose==2)
				{
					System.out.print("Please choose a fruit to eat(1-"+numberOfFruit+"):");
					int nu = in.nextInt();
					myStats += WarehouseFruitStats[nu-1];
					WarehouseFruitName[nu-1] = WarehouseFruitName[numberOfFruit-1];
					WarehouseFruitStats[nu-1] = WarehouseFruitStats[numberOfFruit-1];
					numberOfFruit --;
					System.out.println("You ate it!Now your stats is "+myStats);
				}
				else if(choose==3)
				{
					System.out.print("Please choose a fruit to destroy(1-"+numberOfFruit+"):");
					int nu = in.nextInt();
					WarehouseFruitName[nu-1] = WarehouseFruitName[numberOfFruit-1];
					WarehouseFruitStats[nu-1] = WarehouseFruitStats[numberOfFruit-1];
					numberOfFruit --;
					System.out.println("You have destroy it!");
				}
				else
					System.out.println("Wrong choose!");
			}
			else if(choose==6)
			{
				for(int i = 0;i<numberOfTree;i++)
					trees[i].sleepOneDay();
				System.out.println("A day has gone!");
			}
			else if(choose==0)
				break;
			else
				System.out.println("Wrong choose!");
		}
		System.out.println("Thanks for playing!");
	}

}
