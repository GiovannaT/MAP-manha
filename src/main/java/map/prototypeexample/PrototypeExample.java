/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package map.prototypeexample;

public class PrototypeExample {
    public static void main(String[] args) {

        Person john = new Person("John", 30);
        Person jane = new Person("Jane", 28);

        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype(0, john);
        registry.addPrototype(1, jane);

        Person johnClone = registry.getPrototype(0);
        Person janeClone = registry.getPrototype(1);

        if (johnClone != null && janeClone != null) {

            johnClone.setAge(31);
            janeClone.setAge(29);

            System.out.println(johnClone);
            System.out.println(janeClone);
        }
    }
}
