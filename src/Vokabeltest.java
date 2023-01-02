//import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Vokabeltest{
	public DynArray Vokabelliste = new DynArray();
	DynArray shuffeledList= new DynArray();
	private int counter;
	VokabelWort voc;


	public Vokabeltest(){
		
	}


	public void addVoc(String word, String translation){
		VokabelWort newVoc = new VokabelWort(word, translation);
		Vokabelliste.append(newVoc); 
	}


	public VokabelWort getNextVoc(){
		VokabelWort voc = (VokabelWort) Vokabelliste.getItem(counter);
		this.voc = voc;
		counter++;
		return voc;
	}


	public void shuffleVocList(){
		shuffeledList = Vokabelliste;
		for (int i = 0; i < Vokabelliste.getLength(); i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(0, Vokabelliste.getLength() - 1);
			VokabelWort toshuffle = (VokabelWort) Vokabelliste.getItem(i);
			Vokabelliste.delete(i);
			shuffeledList.setItem(randomNum, toshuffle);
		} 
		Vokabelliste = shuffeledList;
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