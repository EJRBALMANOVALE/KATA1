/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamunod;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class HolaMUnod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Person p1;
        p1 = new Person("Enrique", "Ramon", new Date (64,7,3));
        System.out.println(p1.getBirthday());
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());

    }
}
