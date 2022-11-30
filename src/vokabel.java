public class Vokabel {
	public String word;
	public String translation;
	private int guessedRight;
	private int guessedWrong;

	public Vokabel(String word, String translation){
		this.word = word;
		this.translation = translation;
	}

	public Float getPercentageRight(){
		float percentageright = 100 * (guessedRight / guessedWrong);
		return percentageright;
	}

}