import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Vokabeltest{
	public ArrayList<Vokabel> Vokalbelliste = new ArrayList<Vokabel>();
	private int counter;
	ArrayList<Vokabel> shuffeledList= new ArrayList<Vokabel>();

	public Vokabeltest(){
		
	}
	public void addVoc(String word, String translation){
		Vokabel newVoc = new Vokabel(word, translation);
		Vokalbelliste.add(newVoc); 
	}

	public Vokabel getNextVoc(){
		Vokabel voc = Vokalbelliste.get(counter);
		return voc;
	}

	public void shuffleVocList(){

		for (Vokabel vokabel : Vokalbelliste) {
			int randomNum = ThreadLocalRandom.current().nextInt(0, Vokalbelliste.size() - 1);
			shuffeledList.add(randomNum, vokabel);
		}

		Vokalbelliste = shuffeledList;
	}
}