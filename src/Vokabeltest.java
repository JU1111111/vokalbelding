import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Vokabeltest{
	public ArrayList<Vokabel> Vokalbelliste = new ArrayList<Vokabel>();
	ArrayList<Vokabel> shuffeledList= new ArrayList<Vokabel>();
	private int counter;
	Vokabel voc;

	public Vokabeltest(){
		
	}
	public void addVoc(String word, String translation){
		Vokabel newVoc = new Vokabel(word, translation);
		Vokalbelliste.add(newVoc); 
	}

	public Vokabel getNextVoc(){
		Vokabel voc = Vokalbelliste.get(counter);
		this.voc = voc;
		return voc;
	}

	public void shuffleVocList(){
		shuffeledList = Vokalbelliste;
		for (int i = 0; i < Vokalbelliste.size(); i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(0, Vokalbelliste.size() - 1);
			Vokabel toshuffle = Vokalbelliste.remove(i);
			shuffeledList.add(randomNum, toshuffle);
		} 

		Vokalbelliste = shuffeledList;
	}

	public boolean guess(String guess){
		if (this.voc.translation.equals(guess)){
			this.voc.guessedRight += 1;
			return true;
		}
		else{
			this.voc.guessedWrong += 1;
			return false;
		}
	}
}