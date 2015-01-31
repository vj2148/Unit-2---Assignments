
public class GPSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GPS trip = new GPS();
		
		trip.randomDirection();
		System.out.println();
		System.out.println("The distance from the origin is " + trip.returnDistance());
	}

}
