public class App {
    public static void main(String[] args) throws Exception {
        Vokabeltest voc = new Vokabeltest();
        voc.addVoc("bean","BEEEEEANZ");
        voc.addVoc("bruh","reeee");
        voc.addVoc("bbbbb","Yeeeeeeet");

        for (vokabel V : voc.Vokalbelliste) {
            System.out.println(V.word);
        }
        voc.shuffleVocList();
        for (vokabel V : voc.Vokalbelliste) {
            System.out.println(V.word);
        }
    }
}
