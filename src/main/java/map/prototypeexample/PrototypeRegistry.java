/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map.prototypeexample;

class PrototypeRegistry {
    private Person[] prototypes = new Person[10]; // Tamanho máximo arbitrário para ilustração

    public void addPrototype(int index, Person person) {
        if (index >= 0 && index < prototypes.length) {
            prototypes[index] = person;
        }
    }

    public Person getPrototype(int index) {
        if (index >= 0 && index < prototypes.length) {
            Person person = prototypes[index];
            if (person != null) {
                return person.clone();
            }
        }
        return null;
    }
}