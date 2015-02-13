import java.util.Scanner;


public class Diver{ 
	double [] judges = new double [7];
	
	public static double inputValidScore(){
		Scanner keyboard = new Scanner(System.in);
		double score;
		
		System.out.println("Enter score here:");
		score = keyboard.nextDouble();
		while(score < 0 || score > 10){
			System.out.println("Enter another score.");
			score = keyboard.nextDouble();
		}
		
		return score;
	}
	
	public double[] inputAllScores(){
		double [] scores = new double[7];
		
		for(int x = 0; x < 7; x++){
			scores[x] = inputValidScore();
		}
		
		return scores;
	}
	
	public double inputValidDifficulty(){
		double difficulty;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter difficulty level.");
		difficulty = keyboard.nextDouble();
		while(difficulty < 1.2 || difficulty > 3.8){
			System.out.println("Enter another difficulty level.");
			difficulty = keyboard.nextDouble();
		}
		
		return difficulty;
	}
	
	public double calcuateScore(double[] s, double d){
		double finalScore = 0;
		
		s[0] = 0;
		s[6] = 0;
		
		for(int x = 0; x < 7; x++){
			finalScore += s[x];
		}
		finalScore *= d;
		finalScore *= 0.6;
		
		return finalScore;
	}
	
	public void selectionSort(double[] num){
		int smallest;
		double temp;
		
		for(int i = num.length - 1; i > 0; i--){
			smallest = 0;
			for(int j = 1; j <= i; j++){
				if(num[j] < num[smallest]){
					smallest = j;
				}
			}
			temp = num[smallest];
			num[smallest] = num[i];
			num[i] = temp;
		}
		
	}
	
}
