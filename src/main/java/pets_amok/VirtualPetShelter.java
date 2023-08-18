package pets_amok;

import java.util.HashMap;

public class VirtualPetShelter {
    HashMap<String, VirtualPet> petCollections;
    private static int litterBox = 100;

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

    // public void setPet(RoboticPet newPet) {
    //     this.petCollections.put(newPet.getName(), newPet);
    // }

    // public void setPet(OrganicPet newPet) {
    //     this.petCollections.put(newPet.getName(), newPet);
    // }
    public void setPet(RoboticCat newPet) {
        this.petCollections.put(newPet.getName(), newPet);
    }

    public void setPet(RoboticDog newPet) {
        this.petCollections.put(newPet.getName(), newPet);
    }

    public void setPet(Cat newPet) {
        this.petCollections.put(newPet.getName(), newPet);
    }

    public void setPet(Dog newPet) {
        this.petCollections.put(newPet.getName(), newPet);
    }

    public int getLitterBox() {
        return litterBox;
    }

    public void setLitterBox(int newLitterBox) {
        litterBox = newLitterBox;
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
        petCollections.forEach((name, pet) -> {
            if (pet instanceof Cat) {
                    if (pet.getBladder() >= 100) {
                        pet.setMood(pet.getMood() - 0);
                    } else if (pet.getBladder() >= 70) {
                        pet.setMood(pet.getMood() - 5);
                    } else if (pet.getBladder() >= 40) {
                        pet.setMood(pet.getMood() - 10);
                    } else if (pet.getBladder() >= 20) {
                        pet.setMood(pet.getMood() - 20);
                    }
                }
                setLitterBox(getLitterBox() - 10);
        });

    }

    public void oilingRobots() {
        petCollections.forEach((name, pet) -> {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oiling();
            }
        });

    }

    public void cleanDogCages() {
        petCollections.forEach((name, pet) -> {
            if (pet instanceof Dog) {
                ((Dog) pet).cleanCage();
            }
        });
    }

    public void checkStatus(String tempString) {
        petCollections.get(tempString).status();
    }

    public void walkAllDogs() {
        petCollections.forEach((name, pet) -> {
            if (pet instanceof Dog) {
                ((Dog) pet).walkDoggy(); 
            } else if (pet instanceof RoboticDog) {
                ((RoboticDog) pet).walkDoggy();
            }
        });
    }

    public void cleanLitterBox() {
        petCollections.forEach((name, pet) -> {
            if (pet instanceof Cat) {
                ((Cat) pet).setBladder(100);
                ((Cat) pet).setMood(((Cat) pet).getMood() + 20);
            }
        });

        litterBox = 100;
    }
}
