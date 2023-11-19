public class Departement implements Comparable<Departement>{
    private int id;
    private String nom;
    private int nbrEmploye;

    public Departement() {}

    public Departement(int id, String nom, int nbrEmploye) {
        this.id = id;
        this.nom = nom;
        this.nbrEmploye = nbrEmploye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrEmploye() {
        return nbrEmploye;
    }

    public void setNbrEmploye(int nbrEmploye) {
        this.nbrEmploye = nbrEmploye;
    }

    @Override
    public boolean equals(Object obj) {
        return id == ((Departement)obj).getId() && nom.equals(((Departement)obj).getNom());
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrEmploye=" + nbrEmploye +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return Integer.compare(this.id,o.id);
    }
}
