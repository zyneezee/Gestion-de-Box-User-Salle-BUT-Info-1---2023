public class Note {
    private double moyenne;
    private double medianne;
    private double maxNote;
    private double minNote;

    public Note(double moyenne , double medianne , double maxNote, double minNote){
        this.moyenne=moyenne;
        this.medianne=medianne;
        this.maxNote=maxNote;
        this.minNote=minNote;
    }
    public double getMoyenne(){
        return this.moyenne;
    }
    public double getMedianne(){
        return this.medianne;
    }
    public double getMaxNote(){
        return this.maxNote;
    }
    public double getMinNote(){
        return this.minNote;
    }
    @Override
    public String toString(){
        return "La moyenne est de " + this.moyenne + ", la meilleur note est de " + this.maxNote + ", la note minimale est de " + this.minNote;
    }

}
