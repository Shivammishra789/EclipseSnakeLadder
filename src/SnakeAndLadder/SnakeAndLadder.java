package SnakeAndLadder;

public class SnakeAndLadder {
	public static final int LADDER=1;
	public static final int SNAKE=2;
	
	
	public static void main(String[] args) {
	
		int POSITION=0;
		int diceCount=0;
		
	
	
	while (POSITION !=5) {
		int dice=(int)Math.floor(Math.random() * 10)%6+1;
		if(dice>0) {
			diceCount++;
		}
		
		int options=(int)Math.floor(Math.random() * 10)%3;
		
		System.out.println("Random dice number is " + dice);
		
	
	switch(options) {
	
	case LADDER:
		System.out.println("Ladder");
				POSITION+=dice;
			if(POSITION>5) {
				POSITION-=dice;
			}
				break;
	case SNAKE:
		System.out.println("Snake");
				POSITION-=dice;
		if (POSITION <0) {              //if value less than zero sets to zero
			POSITION=0;
		}
				break;
	default:
		System.out.println("No Play");
			
				break;
				
					}
	System.out.println("Players current position is " + POSITION );
	
	
			}
	System.out.println("WooHoo!! you won the game");
	System.out.println("The number of times dice played is "+diceCount);
		}
	}
