package firstjavaproject;

public class TestBanque {

        public static void main(String[] args) {
            EXO6_Banque B =new EXO6_Banque(11,2000,"W765656");
System.out.println(B.retirer(3000));
        }
    }

    class EXO6_Banque{
        int NCompte;
        double solde;
        String cin;

        public EXO6_Banque(int NCompte, double solde, String cin) {
            this.NCompte = NCompte;
            this.solde = solde;
            this.cin = cin;
        }

        public void diposer(double somme){
            this.solde += somme;
        }
        public boolean retirer(double somme){
            if((solde - somme)>= 0) {
                solde -= somme;
                return  true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Banque{" +
                    "NCompte=" + NCompte +
                    ", solde=" + solde +
                    ", cin='" + cin + '\'' +
                    '}';
        }

}
