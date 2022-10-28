import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Set;

class Xtest {
    String nom ;
    Xtest(String nom ){
        this.nom=nom;

    }

    public String getNom(){
        return this.nom;
    }

     @Override
    public boolean equals(Object obj) {
        // Step 1: Check if the ’obj’ is null
        if ( obj == null ) {
            return false;
        }
// Step 2: Check if the ’obj’ is pointing to the this instance
        if ( this == obj ) {
            return true;
        }
        // Step 3: Check classes equality. Note of caution here: please do not use the
// ’instanceof’ operator unless class is declared as final. It may cause
// an issues within class hierarchies.
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        final Xtest other = (Xtest) obj;
// Step 4: Check individual fields equality
     /*   final Person other = (Person) obj;
        if ( email == null ) {
            if ( other.email != null ) {
                return false;
            }
        } else if( !email.equals( other.email ) ) {
            return false;
        }
        if ( firstName == null ) {
            if ( other.firstName != null ) {
                return false;
            }
        } else if ( !firstName.equals( other.firstName ) ) {
            return false;
        }
        if ( lastName == null ) {
            if ( other.lastName != null ) {
                return false;
            }
        } else if ( !lastName.equals( other.lastName ) ) {
            return false;
        }*/
        return nom.equals(other.nom);
    }
    // @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( nom == null ) ? 0 : nom.hashCode() );

        return result;
    }


}

public class newInstance {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Xtest test = new Xtest("Moohamed");
        //Xtest test1 = Xtest.class.newInstance();
       // Constructor<Xtest> test2 = Constructor.class.newInstance();
        Set<Xtest> set = new HashSet<>();
        set.add(new Xtest("Nadori"));
        set.add(new Xtest("Hicham"));
        set.add(new Xtest("Hicham"));
         boolean cheek = new  Xtest("Nadori").equals(new Xtest("Nadori"));
        System.out.println(cheek);
        set.forEach(x-> System.out.println(x.nom));
    }
}
