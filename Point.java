package point;

public class Point {
    private int abscisse;
    private int ordonnee;
    public Point(){
        this.abscisse=0;
        this.ordonnee=0;
    }
    public Point(int x){
        this.abscisse=x;
        this.ordonnee=x;
    }
    public Point(int x,int y){
        this.abscisse=x;
        this.ordonnee=y;
    }
  public  int abscisse(){
        return this.abscisse;
    }
   public  int ordonnee(){
        return this.ordonnee;
    }
   public Point symetrie(){
        //Point p=new Point(-this.abscisse,this.ordonnee); tu as crée une variable locale
        return new Point(-this.abscisse,this.ordonnee);;
    
    }
    
    
}
