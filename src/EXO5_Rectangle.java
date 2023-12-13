public class EXO5_Rectangle {

        private double longueur;
        private double largeur;
        public EXO5_Rectangle(){

        }
        public EXO5_Rectangle(double longueur,double largeur) {
            this.longueur=longueur;
            this.largeur=largeur;
        }
        public EXO5_Rectangle(EXO5_Rectangle RCL) {
            this.longueur=RCL.longueur;
            this.largeur=RCL.largeur;
        }

        public double getLongueur() {
            return longueur;
        }
        public void setLongueur(double longueur) {
            this.longueur = longueur;
        }
        public double getLargeur() {
            return largeur;
        }
        public void setLargeur(double largeur) {
            this.largeur = largeur;
        }
        public double perimetre() {
            return 2 * ( longueur + largeur);
        }
        public double aire() {
            return (longueur * largeur);
        }
        public void isCarre(double longueur,double largeur) {
            this.longueur=longueur;
            this.largeur=largeur;
            if(longueur==largeur)
                System.out.println("le rectangle est un carre");
            else
                System.out.println("le rectangle n'est pas un carre");
        }
        public String toString() {
            return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
        }

}
