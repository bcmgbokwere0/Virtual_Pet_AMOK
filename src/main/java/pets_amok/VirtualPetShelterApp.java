package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner gameplay = new Scanner(System.in);

        VirtualPetShelter petCollections = new VirtualPetShelter();

        int option;
        boolean quitGame = false;
        boolean goodInput = false;

        System.out.println(
                "Welcome to Brian's WCCI Virtual Pet Shelter... gone wild! Here we take care of our virtual communities's virtual pets ranging from organic animals, specifically dogs and cats, as well as robotic versions!");

        System.out.println(
                "Thank you for choosing to volunteer with us and for admitting your own pet. Please input the name of your pet: ");

        String tempString = gameplay.nextLine();

        System.out.println("Great! Now please input a description for the pet: ");

        String petDescription = gameplay.nextLine();

        petCollections.addPet(new VirtualPet(tempString, petDescription));

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("Wow " + petCollections.getPet(tempString).getName() + " is an awesome name.\n");

        System.out.println("Hope you're ready to have fun working in our shelter! We need you to help take care of "
                + petCollections.getPet(tempString).getName()
                + " and others by feeding them, giving them water, playing with them, cleaning after them, and making them happy! Don't forget we also take care of robotic pets so we have to ensure they're well maintained and oiled! Be prepared for people to also drop off more pets or adopt! Lets get right into things.");

        System.out.println("------------------------------------------------------------------------------------");

        while (true) {
            System.out.println("Current Stats for Organic Pets:\n");

            System.out.println("Pets   |Hunger |Thirst |Mood |Tiredness |Waste ");

            System.out.println("-------|-------|-------|-----|----------|--------");

            for (VirtualPet pet : petCollections.allPets().values()) {

                System.out.print(String.format("%-" + 5 + "s", pet.getName()));

                System.out.print("  |");

                System.out.print(String.format("%-" + 5 + "s", pet.getHunger()));

                System.out.print("  |");

                System.out.print(String.format("%-" + 5 + "s", pet.getThirst()));

                System.out.print("  |");

                System.out.print(String.format("%-" + 5 + "s", pet.getMood()));

                System.out.print("|");

                System.out.print(String.format("%-" + 5 + "s", pet.getTiredness()));

                System.out.print("     |");

                System.out.println(String.format("%-" + 5 + "s", pet.getMaintenance()));

            }

            System.out.println("-------------------------------------------------");

            System.out.println("What would you like to do today?");

            System.out.println("1. Feed all the organic pets.");

            System.out.println("2. Give water to all the organic pets.");

            System.out.println("3. Play with a pet.");

            System.out.println("4. Put all pets to sleep.");

            System.out.println("5. Walk all dogs.");

            System.out.println("6. Clean Dog Cages and litter boxes.");

            System.out.println("7. Oil all robotic pets.");

            System.out.println("8. Check Pet Status");

            System.out.println("9. Admit a pet.");

            System.out.println("10. Adopt a pet.");

            System.out.println("11. End Game");

            while (true) {
                if (!gameplay.hasNextInt()) {

                    System.out.println("You must enter a number.");
                } else {
                    tempString = gameplay.nextLine();
                    option = Integer.parseInt(tempString);
                    if (option <= 11 && option > 0) {
                        goodInput = true;
                    }
                    if (goodInput) {
                        break;
                    }

                    System.out.println("Your number must be selected from the options.");

                }

                gameplay.nextLine();
            }
            switch (option) {

                case 1:
                    System.out.println("----------------------------------------------------------");

                    System.out.println("You fed all the pets! They all really enjoyed the food.");

                    System.out.println("All pets hunger Levels Increased by 20.");

                    System.out.println("----------------------------------------------------------");

                    petCollections.feedPets();

                    break;

                case 2:
                    System.out.println("----------------------------------------------------------");

                    System.out.println("You gave all the pets a refreshing bowl of water.");

                    System.out.println("Thirst Level Increased by 20.");

                    System.out.println("----------------------------------------------------------");

                    petCollections.drinkPets();
                    break;

                case 3:
                    System.out.println("----------------------------------------------------------");

                    System.out.println("Which [pet] will you play with?");
                    for (VirtualPet pet : petCollections.allPets().values()) {
                        System.out.println(("[" + pet.getName() + "]"));
                        System.out.println(pet.getDesc());
                    }

                    tempString = gameplay.nextLine();

                    System.out.println("You and " + tempString
                            + " played a fun game of virtual volleyball. \033[3m You let them win...\033[0m");

                    System.out.println("Mood Increased by 30.");

                    System.out.println("----------------------------------------------------------");
                    petCollections.play(tempString);
                    break;

                case 4:
                    System.out.println("----------------------------------------------------------");

                    System.out.println("You tucked all of the pets into their virtual beds.");

                    System.out.println("Pets became well rested.");

                    System.out.println("----------------------------------------------------------");

                    petCollections.sleepPets();
                    break;

                case 5:
                    System.out.println("----------------------------------------------------------");

                    System.out
                            .println("You released all the dogs from their cages, gave them leashes, and walked them");

                    System.out.println(
                            "All dogs became ecstatic and even avoided some accidents thanks to not being in their cages....");

                    System.out.println("----------------------------------------------------------");

                    petCollections.walkAllDogs();

                    break;
                case 6:
                    System.out.println("----------------------------------------------------------");

                    System.out
                            .println("You geared up and braced yourself to clean all the dog cages and cat litter....");

                    System.out.println("All the pet's waste levels were refreshed.... but at what cost???");

                    System.out.println("----------------------------------------------------------");

                    petCollections.cleanHouse();

                    break;
                case 7:
                    System.out.println("----------------------------------------------------------");

                    System.out.println("You brought out some high quality oil and joyfully oiled all the robotic pets");

                    System.out.println("That...wasn't so bad? All robotic pets maintenance were replenished.");

                    System.out.println("----------------------------------------------------------");

                    petCollections.oilingRobots();

                    break;
                case 8:
                    System.out.println("Which pet would you like to check the status of?");
                    for (VirtualPet pet : petCollections.allPets().values()) {
                        System.out.println(("[" + pet.getName() + "]"));
                        System.out.println((pet.getDesc()));
                    }

                    tempString = gameplay.nextLine();

                    petCollections.checkStatus(tempString);

                    break;

                case 9:
                    System.out.println("Whats the name of the new pet we will admit?");

                    tempString = gameplay.nextLine();

                    System.out.println("Please give a description for " + tempString);
                    petDescription = gameplay.nextLine();

                    petCollections.addPet(new VirtualPet(tempString, petDescription));
                    petCollections.getPet(tempString).setDesc(petDescription);

                    break;

                case 10:
                    System.out.println("Which [pet] will we welcome to a new happy family?");
                    for (VirtualPet pet : petCollections.allPets().values()) {
                        System.out.println(("[" + pet.getName() + "]"));
                        System.out.println((pet.getDesc()));
                    }

                    tempString = gameplay.nextLine();

                    petCollections.removePet(tempString);

                    System.out.println(
                            "Say goodbye to " + tempString + "! Hope they're happy in their new loving virtual home!");

                    break;

                case 11:
                    gameplay.close();
                    quitGame = true;
                    break;
            }

            if (quitGame) {
                break;
            }

            petCollections.tick();
        }

        gameplay.close();
        System.out.println("Thanks for Playing, the pets will miss you :).");
    }
}
