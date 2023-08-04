package pets_amok;

import java.util.HashMap;

public class VirtualPetShelter {
    HashMap<String, VirtualPet> petCollections;

    // Constructor
    public VirtualPetShelter() {
        petCollections = new HashMap<String, VirtualPet>();

    }

    // Getters and Setters
    public VirtualPet getPet(String name) {
        return petCollections.get(name);
    }

    public void setPet(VirtualPet newPet) {
        this.petCollections.put(newPet.getName(), newPet);
    }

    public void setPet(RoboticPet newPet) {
        this.petCollections.put(newPet.getName(), newPet);
    }

    public void setPet(OrganicPet newPet) {
        this.petCollections.put(newPet.getName(), newPet);
    }

    public void setPet(Cat newPet) {
        this.petCollections.put(newPet.getName(), newPet);
    }

    public void setPet(Dog newPet) {
        this.petCollections.put(newPet.getName(), newPet);
    }
    // Methods

    public HashMap<String, VirtualPet> allPets() {

        return petCollections;
    }

    public void addPet(VirtualPet newPet) {
        petCollections.put(newPet.getName(), newPet);
    }

    public void removePet(String petName) {
        VirtualPet adoptedPet = petCollections.get(petName);
        petCollections.remove(adoptedPet.getName(), adoptedPet);
    }

    // feed/water all the organic pets no robotic pets
    public void feedPets() {
        petCollections.forEach((name, pet) -> pet.feed());
    }

    public void drinkPets() {
        petCollections.forEach((name, pet) -> pet.drink());
    }

    public void play(String tempString) {
        petCollections.get(tempString).play();
    }

    public void sleepPets() {
        petCollections.forEach((name, pet) -> pet.sleep());
    }

    public void tick() {
        petCollections.forEach((name, pet) -> pet.tick());
    }

    public void oilingRobots() {
        petCollections.forEach((name, pet) -> pet.oiling());
    }

    public void cleanDogCages() {
        petCollections.forEach((name, pet) -> pet.cleanCage());
    }

    public void cleanCatLitter() {
        petCollections.forEach((name, pet) -> pet.cleanLitterBox());
    }

    public void checkStatus(String tempString) {
        petCollections.get(tempString).status();
    }

    public void walkAllDogs() {
        petCollections.forEach((name, pet) -> pet.walkDoggy());
    }
}
