import java.util.ArrayList;
import java.util.List;

public class Cours {

    private List<Horaire> horaire;
    private List<Groupe> groupe;
    private Matiere matiere;

    public Cours(Matiere matiere){
        this.horaire= new ArrayList<>();
        this.groupe = new ArrayList<>();
        this.matiere = matiere;
    }

    public void ajouteGroupe(Groupe groupe){
        this.groupe.add(groupe);
    }

    public void ajouteHoraire(Horaire horaire){
        this.horaire.add(horaire);
    }

    public List<Groupe> getGroupe(){
        return this.groupe;
    }
    public List<Horaire> getHoraire(){
        return this.horaire;
    }

    @Override
    public String toString() {
        return "Ce cours est un cours de "+this.matiere+" à ces horaires "+this.horaire+" avec ces groupes "+this.groupe;
    }
}
