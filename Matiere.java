import java.util.ArrayList;
import java.util.List;

public class Matiere {
    private int idMatiere;
    private String nom;
    private List<Cours> lesCours;
    private List<Note> lesNotes;
    public Matiere(int id){
        this.idMatiere = id;
        this.lesCours = new ArrayList<>();
        this.lesNotes = new ArrayList<>();
    }

    public int getId(){
        return this.idMatiere;
    }


    public String getNom(){
        return this.nom;
    }

    public void ajouteCours(Cours cours){
        this.lesCours.add(cours);
    }

    public void ajouteNote(Note note){
        this.lesNotes.add(note);
    }
}
