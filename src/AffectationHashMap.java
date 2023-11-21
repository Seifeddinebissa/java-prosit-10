import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    Map<Employe,Departement> map;
    public AffectationHashMap(){
        map = new HashMap<>();
    }
    public void ajouterEmployeDepartement(Employe e, Departement d){
        map.put(e,d);
    }
    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Employe,Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNom()+" "+entry.getKey().getPrenom()+" : "+entry.getValue().nomDepartement);
        }
    }
    public void supprimerEmploye (Employe e){
        map.remove(e);
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d){
        map.remove(e,d);
    }
    public void afficherEmployes(){
        System.out.println("Liste des employées");
        for (Employe e:map.keySet()) {
            System.out.println(e.getNom()+" "+e.getPrenom());
        }
    }
    public void afficherDepartements(){
        System.out.println("Liste des departements");
        for (Departement d: map.values()) {
            System.out.println(d.nomDepartement);
        }
    }
    public boolean rechercherEmploye (Employe e){
        return map.containsKey(e);
    }
    public boolean rechercherDepartement (Departement d){
        return map.containsValue(d);
    }

    Comparator<Employe> idComparator = new Comparator<Employe>() {
        @Override
        public int compare(Employe e1, Employe e2) {
            return e1.compareTo(e2);
        }
    };

    public TreeMap<Employe, Departement> trierMap(){
        TreeMap<Employe,Departement> mapTrie = new TreeMap<Employe,Departement>(idComparator.thenComparing(idComparator));
        mapTrie.putAll(map);
        return mapTrie;
    }
}
