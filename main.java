package point;


public class main {
    public static void main(String[] args) {
    Point A=new Point();
    Point B=new Point(5);
    Point C=new Point(3,8);
        System.out.println("le point A mes coordonnees sont : A("+A.abscisse()+","+A.ordonnee()+")");
        System.out.println("l image de A est : A-1("+A.symetrie().abscisse()+","+A.symetrie().ordonnee()+")");
        System.out.println("le point B mes coordonnees sont : B("+B.abscisse()+","+B.ordonnee()+")");
        System.out.println("l image de B est : B-1("+B.symetrie().abscisse()+","+B.symetrie().ordonnee()+")");
        System.out.println("le point C mes coordonnees sont : C("+C.abscisse()+","+C.ordonnee()+")");
        System.out.println("l image de C est : C-1("+C.symetrie().abscisse()+","+C.symetrie().ordonnee()+")");
        
    }
}
