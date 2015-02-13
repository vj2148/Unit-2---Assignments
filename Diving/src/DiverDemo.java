
public class DiverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diver diverBob = new Diver();
		double[] bobScore = new double[7];
		double level;
		double bobFinalScore;
		
		bobScore = diverBob.inputAllScores();
		diverBob.selectionSort(bobScore);
		level = diverBob.inputValidDifficulty();
		bobFinalScore = diverBob.calcuateScore(bobScore, level);
		
		System.out.println("Your final score is " + bobFinalScore);
		
	}

}
