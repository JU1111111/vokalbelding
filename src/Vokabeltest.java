import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Vokabeltest{
	public ArrayList<voc> Vokalbelliste = new ArrayList<voc>();
	ArrayList<voc> shuffeledList= new ArrayList<voc>();
	private int counter;
	voc voc;


	public Vokabeltest(){
		
	}


	public void addVoc(String word, String translation){
		voc newVoc = new voc(word, translation);
		Vokalbelliste.add(newVoc); 
	}


	public voc getNextVoc(){
		voc voc = Vokalbelliste.get(counter);
		this.voc = voc;
		return voc;
	}


	public void shuffleVocList(){
		shuffeledList = Vokalbelliste;
		for (int i = 0; i < Vokalbelliste.size(); i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(0, Vokalbelliste.size() - 1);
			voc toshuffle = Vokalbelliste.remove(i);
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