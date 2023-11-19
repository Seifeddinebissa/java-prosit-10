import java.util.ArrayList;
import java.util.List;

public class SocieteArrayList implements IGestion,Comparable{
    List<Employe> l = new ArrayList<Employe>();
    @Override
    public void ajouterEmploye(Employe e) {
        l.add(e);
        System.out.println("Employé ajouter avec succes");
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return l.contains(nom);
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return l.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        l.remove(e);
        System.out.println("Emploté supprimer avec succes");
    }

    @Override
    public void displayEmploye() {
        for (Employe e : l) {
            e.toString();
        }
    }

    @Override
    public void trierEmployeParId() {

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
