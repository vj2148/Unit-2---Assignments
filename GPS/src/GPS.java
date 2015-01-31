import java.util.Random;


public class GPS {
	int xcorrdinate = 0;
	int ycorrdinate = 0;
	public static final int TURNS = 12;
	
	public void randomDirection(){
		Random rand = new Random();
		int num = 0;
		
		for(int x = 0; x < TURNS; x++){
			num = rand.nextInt(4);
			if(num == 0){
				ycorrdinate += 5;
				System.out.print("North ");
				System.out.println("(" + xcorrdinate + "," + ycorrdinate + ")");
			}else if(num == 1){
				xcorrdinate += 5;
				System.out.print("East ");
				System.out.println("(" + xcorrdinate + "," + ycorrdinate + ")");
			}else if(num == 2){
				ycorrdinate -= 5;
				System.out.print("South ");
				System.out.println("(" + xcorrdinate + "," + ycorrdinate + ")");
			}else if(num == 3){
				xcorrdinate -= 5;
				System.out.print("West ");
				System.out.println("(" + xcorrdinate + "," + ycorrdinate + ")");
			}
		}
		
		
	}
	
	public double returnDistance(){
		double distance = 0;
		double xcor;
		double ycor;
		double sum;
		
		xcor = Math.pow(xcorrdinate, 2);
		ycor = Math.pow(ycorrdinate, 2);
		sum = xcor + ycor;
		distance = Math.sqrt(sum);
		
		return distance;
	}
	
}
