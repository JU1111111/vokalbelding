public class App {
    public static void main(String[] args) throws Exception {
        //new GUI();
        testing();
    }
    public static void testing() {
        Vokabeltest voc = new Vokabeltest();
        voc.addVoc("bean","BEEEEEANZ");
        voc.addVoc("bruh","reeee");
        voc.addVoc("bbbbb","Yeeeeeeet");

        for (VokabelWort V : voc.Vokalbelliste) {
            System.out.println(V.word);
        }
        voc.shuffleVocList();
        for (VokabelWort V : voc.Vokalbelliste) {
            System.out.println(V.word);
        }
           
    }
}
