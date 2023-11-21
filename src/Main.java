import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Departement departement1 = new Departement(1, "Ressources Humaines", 10);
        Departement departement2 = new Departement(2, "Informatique", 20);
        Departement departement3 = new Departement(3, "Marketing", 15);


        DepartemenHashSet departementHashSet = new DepartemenHashSet();


        departementHashSet.ajouterDepartement(departement1);
        departementHashSet.ajouterDepartement(departement2);
        departementHashSet.ajouterDepartement(departement3);


        System.out.println("Liste des départements :");
        departementHashSet.displayDepartement();


        String nomRecherche = "Informatique";
        System.out.println("\nRecherche du département '" + nomRecherche + "':");
        boolean existeNom = departementHashSet.rechercherDepartement(nomRecherche);
        System.out.println("Le département existe : " + existeNom);


        System.out.println("\nSuppression du département :");
        departementHashSet.supprimerDepartement(departement2);
        departementHashSet.displayDepartement();


        System.out.println("\nTri des départements par id :");
        TreeSet<Departement> departementsTries = departementHashSet.trierDepartementById();
        for (Departement departement : departementsTries) {
            System.out.println(departement);
        }

        AffectationHashMap map = new AffectationHashMap();
        Employe e1 = new Employe(2,3,"seif","eddine","tic");
        Employe e2 = new Employe(4,3,"anas","anas","tic");
        Employe e3 = new Employe(3,3,"jihed","jihed","tic");

        map.ajouterEmployeDepartement(e2,departement2);
        map.ajouterEmployeDepartement(e2,departement3);
        map.ajouterEmployeDepartement(e1,departement1);
        map.afficherEmployesEtDepartements();
        //map.supprimerEmployeEtDepartement(e2,departement2);
        //map.afficherEmployesEtDepartements();
        System.out.println(map.map);
        System.out.println(map.trierMap());
    }
}