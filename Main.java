import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myAnimal1 = new Animal();
        System.out.println(myAnimal.name);
        System.out.println(myAnimal1.name);

        Square mySquare = new Square();
        mySquare.x  = 3;
        mySquare.y = 5;
        System.out.println(mySquare.x);
        System.out.println(mySquare.y);

    }
}
