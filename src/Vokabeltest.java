import java.util.ArrayList;

public class Vokabeltest{
	public ArrayList<Vokabel> vokabeln;
	public Vokabeltest(){}
	public void addVoc(String word, String translation){
		Vokabel voc = new Vokabel(word, translation);
		this.vokabeln.add(voc);
	}


}