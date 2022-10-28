
class Etudiant {

    private String nom ;
    private int age ;
  Etudiant(String nom,int age){
      this.nom = nom;
      this.age = age ;
  }
  /*  @Override
    public boolean equals(Object obj) {

        Etudiant etd=(Etudiant) obj;
        return  this.nom.equals(etd.nom) && this.age==etd.age;
    }*/
  public boolean equals(Object otherObject) {
// tester rapidement si les objets sont identiques
      if (this == otherObject) return true;
// doit renvoyer false si le paramètre explicite vaut null
      if (otherObject == null) return false;
// si les classes ne correspondent pas,
// elles ne peuvent pas être égales
      if (getClass() != otherObject.getClass())
          return false;
// nous savons maintenant que otherObject
// est un objet Employee non null
      Etudiant other = (Etudiant) otherObject;
// tester si les champs ont des valeurs identiques
      return nom.equals(other.nom)
              && age == other.age;
  }
}
class  kassoul extends  Etudiant {

     int abscence;

    kassoul(String nom, int age,int abscence) {
        super(nom, age);
        this.abscence=abscence;
    }

    @Override
    public boolean equals(Object obj) {
       if(this.equals(obj))
           return  false;
       kassoul ksl = (kassoul) obj;
       return ksl.abscence==ksl.abscence;
    }
}


public class Cosmetique {


    public static void main(String[] args) {

        Etudiant etd1 = new Etudiant("Hicham",21);
        Etudiant etd2 = new Etudiant("Hichama",21);
         etd2=etd1;
         Etudiant etd3 = etd2;

        System.out.println(etd1.equals(etd2));
        System.out.println(etd1==etd2);
   //     System.out.println(prof1.equals(etd1));
        System.out.println(etd3.equals(etd2));
        System.out.println(etd1.equals(etd2));

    }

}
