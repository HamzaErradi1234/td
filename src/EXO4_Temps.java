public class EXO4_Temps {
    protected double heure;
    protected double munite;
    protected double seconde;
    public EXO4_Temps() {
        this.heure=0.0d;
        this.munite=0.0d;
        this.seconde=0.0d;
    }
    public EXO4_Temps(double heure) {
        this.heure=heure;
    }
    public EXO4_Temps(double heure,double munite) {
        this(heure);
        this.munite=munite;
    }
    public EXO4_Temps(double heure,double munite,double seconde) {
        this(heure,munite);
        this.seconde=seconde;
    }
    public EXO4_Temps(EXO4_Temps HMS) {
        this.heure=HMS.heure;
        this.munite=HMS.munite;
        this.seconde=HMS.seconde;
    }
    public void ajouterHeure(double heure) {
        this.heure=heure;
        if(heure>=0 && heure<=23)
            System.out.println(" L'heure est "+heure);
        else
            System.out.println("le jour prochain");
    }
    public void ajouterMinute(double munite) {
        this.munite=munite;
        if(munite>=0 && munite<=59)
            System.out.println(" Le munite est "+munite);
        else
            System.out.println("l'heure prochaine");
    }
    public void ajouterSeconde(double seconde) {
        this.seconde=seconde;
        if(seconde>=0 && seconde<=59)
            System.out.println(" Le seconde est "+seconde);
        else
            System.out.println("la munite prochaine");
    }

    public String toString() {
        return "Temps est : " + heure + ":" + munite + ":" + seconde ;
    }
}
