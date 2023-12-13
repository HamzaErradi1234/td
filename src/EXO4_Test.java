public class EXO4_Test {
    public static void main(String[] args) {
        EXO4_Temps t = new EXO4_Temps(20, 23, 1);
        System.out.println(t.toString());
        t.ajouterMinute(400);
        System.out.println(t.toString());
        t.ajouterSeconde(3600);
        System.out.println(t.toString());
    }
}
