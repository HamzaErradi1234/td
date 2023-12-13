public class EXO3_TestLivre {
    public static void main(String[] args) {
        EXO3_Livre l1 = new EXO3_Livre();
        EXO3_Livre l2 = new EXO3_Livre("JAVA");
        EXO3_Livre l3 = new EXO3_Livre("JAVA","AAAAAA");
        EXO3_Livre l4 = new EXO3_Livre("JAVA", "AAAAAA", 40);
        EXO3_Livre l5 = new EXO3_Livre("JAVA", "AAAAAA", 40, 2023);
        EXO3_Livre l6 = new EXO3_Livre(l5);
        System.out.println(l1);

    }
}
