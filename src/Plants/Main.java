package Plants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Game Mode: ");
        String mode = sc.nextLine();

        int position = 0;
        String input;
        do {
            System.out.print("Add a plant: ");
            input = sc.nextLine();
            switch (input) {
                case "DONE":
                    break;
                case "Sunflower":
                    plants.add(new Plant.Sunflower());
                    break;
                case "Twin Sunflower":
                    position = 0;
                    for(Plant p : plants){
                        if(p instanceof Plant.Sunflower){
                            plants.remove(p);
                            break;
                        }
                        position++;
                    }
                    plants.add(position, (Plant) new Plant.Sunflower().upgrade());
                    break;
                case "Peashooter":
                    plants.add(new Plant.Peashooter());
                    break;
                case "Wall Nut":
                    plants.add(new Plant.WallNut());
                    break;
                case "Squash":
                    plants.add(new Plant.Squash());
                    break;
                case "Jalapeno":
                    plants.add(new Plant.Jalapeno());
                    break;
                case "Coffee Bean":
                    for(Plant plant : plants){
                        if(plant instanceof Mushroom){
                            if(!((Mushroom) plant).isAwake()){
                                Plant.CoffeeBean coffeeBean = new Plant.CoffeeBean();
                                ((Mushroom) plant).awaken(coffeeBean);
                                System.out.println(coffeeBean.die());
                                break;
                            }
                        }
                    }
                    break;
                case "Lily Pad":
                    plants.add(new Plant.LilyPad());
                    break;
                case "Cattail":
                    position = 0;
                    for(Plant p : plants){
                        if(p instanceof Plant.LilyPad){
                            plants.remove(p);
                            break;
                        }
                        position++;
                    }
                    plants.add(position, (Plant) new Plant.LilyPad().upgrade());
                    break;
                case "Sun-shroom":
                    boolean state = mode.equals("Night") || mode.equals("Fog");
                    if(!state) {
                        for(Plant p : plants) {
                            if(p instanceof Plant.CoffeeBean) {
                                plants.remove(p);
                                state = true;
                                break;
                            }
                        }
                    }
                    plants.add(new Mushroom.SunShroom(state));
                    break;
                case "Puff-shroom":
                    state = mode.equals("Night") || mode.equals("Fog");
                    plants.add(new Mushroom.PuffShroom(state));
                    break;
                case "Doom-shroom":
                    state = mode.equals("Fog") || mode.equals("Night");
                    plants.add(new Mushroom.DoomShroom(state));
                    break;
                default:
                    System.out.println(input + " is not a plant");
            }
        } while (!input.equals("DONE"));

        do {
            System.out.print("Do something: ");
            input = sc.nextLine();
            int counter = 0;
            switch (input) {
                case "DONE":
                    break;
                case "Produce Sun":
                    // add implementation here
                    counter = 0;
                    int totalSun = 0;
                    for(Plant plant : plants){
                        if(plant instanceof SunProducer && plant.isAlive()){
                            counter++;
                            totalSun += ((SunProducer) plant).produce_sun();
                        }
                    }
                    if(counter > 0){
                        System.out.println(counter + " sun producers gather " + totalSun + " suns");
                    }else{
                        System.out.println("You have no sun producers");
                    }
                    break;
                case "Attack":
                    // add implementation here
                    counter = 0;
                    int totalDamage = 0;
                    for(Plant plant : plants){
                        if(plant instanceof Attacker && plant.isAlive()){
                            totalDamage += ((Attacker) plant).attack();
                            counter++;
                        }
                    }
                    if(counter > 0){
                        System.out.println(counter + " attackers dealing " + totalDamage + " damage");
                    }else{
                        System.out.println("You have no attackers");
                    }
                    break;
                // add more cases here
                case "Instant Kill Status":
                    int count = 0;
                    for(Plant p : plants) {
                        if(p instanceof InstantKiller && p.isAlive()) {
                            if(((InstantKiller) p).killType() == 1) {
                                System.out.println(p.name + " can kill instantly");
                            } else {
                                System.out.println(p.name + " can kill on contact");
                            }
                            count++;
                        }
                    }

                    if(count == 0) {
                        System.out.println("You have no plants which can kill instantly");
                    }

                    break;
                case "Attacker Status":
                    count = 0;
                    for(Plant p : plants) {
                        if(p instanceof Attacker && p.isAlive()) {
                            if(((Attacker) p).rangeType() == 1) {
                                System.out.println(p.name + " can attack on a single line");
                            }
                            else if(((Attacker) p).rangeType() == 2) {
                                System.out.println(p.name + " can attack using area-of-effect");
                            }
                            else if(((Attacker) p).rangeType() == 3) {
                                System.out.println(p.name + " can attack only when enemy is nearby");
                            }
                            else if(((Attacker) p).rangeType() == 4) {
                                System.out.println(p.name + " can attack any enemies from anywhere");
                            }
                            count++;
                        }
                    }
                    if(count==0){
                        System.out.println("You have no attackers");
                    }
                    break;

                case "Sort by HP":
                    Collections.sort(plants, new Plant.PlantHpComparator());
                    for(Plant plant : plants){
                        System.out.println(plant);
                    }
                    break;
                case "Sort by Name":
                    Collections.sort(plants);
                    for(Plant plant : plants){
                        System.out.println(plant);
                    }
                    break;

                case "Sort by Sun Cost":
                    Collections.sort(plants, new Plant.PlantSunCostComparator());
                    for(Plant plant : plants){
                        System.out.println(plant);
                    }
                    break;

                default:
                    System.out.println("Unknown action: " + input);
            }
        } while (!input.equals("DONE"));
    }
}
