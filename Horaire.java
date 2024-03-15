import java.util.List;
import java.util.ArrayList;

public class Horaire {
    private LocalDateTime heureDebut;
    private LocalDateTime heureFin;
    private List<Salle> lesSalles;
    private List<Groupe> lesGroupes;
    public Horaire(String debut, String fin){
        this.heureDebut = debut;
        this.heureFin = fin;
        this.lesSalles = new ArrayList<>();
        this.lesGroupes = new ArrayList<>();
    }

    public String getHeureDebut(){
        return this.heureDebut;
    }

    public String getHeureFin(){
        return this.heureFin;
    }

    public void ajouteSalle(Salle salle){
        this.lesSalles.add(salle);
    }

    public void ajouteGroupe(Groupe groupe){
        this.lesGroupes.add(groupe);
    }

    public String toString(){
        return "heure début : " + this.heureDebut + " heure fin : " + this.heureFin;
    }
}
