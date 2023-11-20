import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartmentHashSet implements IDepartement<Departement>{

    Set<Departement> set = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        set.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        boolean test = false;
        for (Departement obj : set) {
            if (obj.getNom().equals(nom)) {
                test = true;
            }
            break;
        }
        return test;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return set.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        set.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for (Departement dep:set) {
            dep.toString();
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        Set<Departement> treeSet = new TreeSet<>(set);
        return (TreeSet<Departement>) treeSet;
    }
}
