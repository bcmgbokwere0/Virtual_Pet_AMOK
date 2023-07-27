package pets_amok;

public class VirtualPet extends VirtualPetShelter {
    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int tiredness;
    private int mood;

    // Constructors

    public VirtualPet() {
        setHunger(100);
        setThirst(100);
        setTiredness(100);
        setMood(100);
    }

    public VirtualPet(String newName, String newDesc) {
        setName(newName);
        setDesc(newDesc);
        setHunger(100);
        setThirst(100);
        setTiredness(100);
        setMood(100);
    }

    // Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String description) {
        this.description = description;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    // Methods

    public void feed() {
        setHunger(getHunger() + 20);
    }

    public void drink() {
        setThirst(getThirst() + 20);
    }

    public void play() {
        setMood(getMood() + 30);
    }

    public void sleep() {
        setTiredness(100);
    }

    public void tick() {
        setHunger(getHunger() - 5);

        setThirst(getThirst() - 5);

        setTiredness(getTiredness() - 5);

        if (getHunger() >= 100 || getThirst() >= 100) {
            setMood(getMood() - 0);
        } else if (getHunger() >= 70 || getThirst() >= 70) {
            setMood(getMood() - 5);
        } else if (getHunger() >= 40 || getThirst() >= 40) {
            setMood(getMood() - 10);
        } else if (getHunger() >= 20 || getThirst() >= 20) {
            setMood(getMood() - 20);
        }
    }

}