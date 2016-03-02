import com.esliceu.ProvaCaixaNegre;
/**
 * Test javadoc de clase.
 * @author Pikachu
 * @version 777
 */
public class DNI {
    /**
     * Función que realiza las pruebas.
     * @param args variables de psvm.
     */
    public static void main(String[] args) {
        ProvaCaixaNegre p = new ProvaCaixaNegre();

        /* Lletra DNI
        *Prueba integridad parametros: Succesful
        *
        *Prueba aleatoria: Failed
        *
        *Prueba integridad funcional: Failed
        *
        *Prueba valores limite: Failed
        *
        *
        */

        //Integridad parametros (no compila)
        //System.out.println(p.lletraDNI("potato"));
        //System.out.println(p.lletraDNI(7.2));

        //Aleatorias (Falla el 0000001)
        System.out.println(p.lletraDNI(43468520));
        System.out.println(p.lletraDNI(0000001));

        //Integridad funcional (Admite 1 numero mas de la cuenta.)
        System.out.println(p.lletraDNI(434685203));

        //Valores limites (admite valores erroneos)
        System.out.println(p.lletraDNI(999999999));
        System.out.println(p.lletraDNI(0));


    }
}
