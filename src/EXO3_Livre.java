public class EXO3_Livre{

private String titre, auteur;
private double prix;
private int annee;

public final int s;

    EXO3_Livre(){
        this.s = 3;
        }
    EXO3_Livre(String titre){
        this();
        this.titre = titre;
        }

    EXO3_Livre(String titre, String auteur){
//        this.titre = titre;
        this(titre);
        this.auteur = auteur;
        }

    EXO3_Livre(String titre, String auteur , double prix){
//        this.titre = titre;
//        this.auteur = auteur;
        this(titre, auteur);
        this.prix = prix;
        }
    EXO3_Livre(String titre, String auteur , double prix, int annee){
//        this.titre = titre;
//        this.auteur = auteur;
//        this.prix = prix;
        this(titre,auteur,prix);
        this.annee = annee;
        }
    EXO3_Livre(EXO3_Livre l ){

        this(l.getTitre(), l.getAuteur(),l.getPrix(), l.getAnnee());

        }

public String getTitre() {
        return titre;
        }

public void setTitre(String titre) {
        this.titre = titre;
        }

public String getAuteur() {
        return auteur;
        }

public void setAuteur(String auteur) {
        this.auteur = auteur;
        }

public double getPrix() {
        return prix;
        }

public void setPrix(double prix) {
        this.prix = prix;
        }

public int getAnnee() {
        return annee;
        }

public void setAnnee(int annee) {
        this.annee = annee;
        }

@Override
public String toString() {
        return "Livre{" +
        "titre='" + titre + '\'' +
        ", auteur='" + auteur + '\'' +
        ", prix=" + prix +
        ", annee=" + annee +
        ", s=" + s +
        '}';
        }
}