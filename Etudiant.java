import java.util.List;
import java.util.ArrayList;

public class Etudiant {
    private int numEtudiant;
    private String prenom;
    private String nom;
    private List<Groupe> lesGroupes;
    private List<Note> lesNotes;

    public Etudiant(int numEtudiant , String prenom , String nom ){
        this.numEtudiant=numEtudiant;
        this.prenom=prenom;
        this.nom=nom;
        this.lesGroupes = new ArrayList<>();
        this.lesNotes = new ArrayList<>();
    }
    public int getNumEtudiant(){
        return this.numEtudiant;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public String getNom(){
        return this.nom;
    }
    public void ajouteGroupe(Groupe groupe){
        this.lesGroupes.add(groupe);
    }
    public void ajouteNote(Note note){
        this.lesNotes.add(note);
    }
    @Override
    public String toString(){
        return "Le numero d'etudiant :" + this.numEtudiant + ", le prenom d'etudiant : " + this.prenom + ", le nom d'etudiant :  " + this.nom ;
    }
}