import java.util.List;

public class Horaire {
    private String heureDebut;
    private String heureFin;
    private List<Salle> lesSalles;
    private List<Cours> lesCours; 
    public Horaire(String debut, String fin){
        this.heureDebut = debut;
        heureFin = fin;
    }

    public String getHeureDebut(){
        return this.heureDebut;
    }

    public String getHeureFin(){
        return this.heureFin;
    }
}
