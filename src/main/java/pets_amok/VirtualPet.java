package pets_amok;

public abstract class VirtualPet {
    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int tiredness;
    private int mood;
    private int bladder;

    // Constructors

    public VirtualPet() {
        setHunger(100);
        setThirst(100);
        setTiredness(100);
        setMood(100);
        setBladder(100);
    }

    public VirtualPet(String newName, String newDesc) {
        setName(newName);
        setDesc(newDesc);
        setHunger(100);
        setThirst(100);
        setTiredness(100);
        setMood(100);
        setBladder(100);
    }

    // Getter and Setters

    // instanceof tells you what class it is/what it is working from
    public String getType() {
        if (this instanceof RoboticCat || this instanceof RoboticDog) {
            return "Robo   ";
        } else {
            return "Organic";
        }
    }

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

    public int getBladder() {
        return bladder;
    }

    public void setBladder(int bladder) {
        this.bladder = bladder;
    }

    // Methods
    public void play() {
        setMood(getMood() + 30);
    }

    public void sleep() {
        setTiredness(100);
    }

    public void feed() {
        setHunger(getHunger() + 20);
    }

    public void drink() {
        setThirst(getThirst() + 20);
    }

    public void tick() {
        setHunger(getHunger() - 5);

        setThirst(getThirst() - 5);

        setTiredness(getTiredness() - 5);

        setBladder(getBladder() - 5);

        if (getBladder() >= 100) {
            setMood(getMood() - 0);
        } else if (getBladder() >= 70) {
            setMood(getMood() - 5);
        } else if (getBladder() >= 40) {
            setMood(getMood() - 10);
        } else if (getBladder() >= 20) {
            setMood(getMood() - 20);
        }
    }

    public void status() {
        if (getMood() >= 80) {
            System.out.println("Feels great!");
        } else if (getMood() >= 50) {
            System.out.println("Feels ok.");
        } else if (getMood() >= 30) {
            System.out.println("Is feeling uneasy.. :/");
        } else if (getMood() >= 0) {
            System.out.println("Is unhappy... :(");
        }
    }

}