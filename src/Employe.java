public class Employe {
    private int  identifiant;
    private String prenom;
    private String nom;
    private String nomDepartement;
    private String grade;

    public Employe() {
    }

    public Employe(int identifiant, String prenom, String nom, String nomDepartement, String grade) {
        this.identifiant = identifiant;
        this.prenom = prenom;
        this.nom = nom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        return this.identifiant == ((Employe)obj).getIdentifiant() && this.nom.equals(((Employe) obj).getNom());
    }

    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
