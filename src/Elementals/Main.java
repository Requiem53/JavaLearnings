package Elementals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        List<Alloy> alloys = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter element/alloy: ");
            input = sc.nextLine();
            switch (input) {
                case "Titanium":
                    elements.add(new TransitionMetal.Titanium());
                    break;
                case "Gold":
                    elements.add(new TransitionMetal.Gold());
                    break;
                case "Zinc":
                    elements.add(new TransitionMetal.Zinc());
                    break;
                case "Iron":
                    elements.add(new TransitionMetal.Iron());
                    break;
                case "Copper":
                    elements.add(new TransitionMetal.Copper());
                    break;
                // TODO add more cases here
                case "Technetium":
                    elements.add(new TransitionMetal.Technetium());
                    break;
                case "Tin":
                    elements.add(new PostTransitionMetal.Tin());
                    break;
                case "Aluminum":
                    elements.add(new PostTransitionMetal.Aluminum());
                    break;
                case "Uranium":
                    elements.add(new Actinide.Uranium());
                    break;
                case "Steel":
                    alloys.add(new Alloy.Steel());
                    break;
                case "Brass":
                    alloys.add(new Alloy.Brass());
                    break;
                case "Bronze":
                    alloys.add(new Alloy.Bronze());
                    break;
            }
        } while (!input.equals("DONE"));

        do {
            int counter;
            System.out.print("Enter action: ");
            input = sc.nextLine();
            switch (input){
                case "Radiate":
                    // TODO Radiate here
                    counter = 0;
                    for(Element element : elements){
                        if(element instanceof Radioactive){
                            ((Radioactive) element).radiate();
                            System.out.println(element +"'s half-life: " + ((Radioactive) element).half_life());
                            counter++;
                        }
                    }

                    for(Alloy alloy : alloys){
                        if(alloy instanceof Radioactive){
                            ((Radioactive) alloy).radiate();
                            System.out.println(alloy +"'s half-life: " + ((Radioactive) alloy).half_life());
                            counter++;
                        }
                    }

                    if(counter == 0){
                        System.out.println("No radioactive materials present");
                    }

                    break;
                case "Magnetize":
                    // TODO Radiate here
                    counter = 0;

                    for(Element element : elements){
                        if(element instanceof Magnetic){
                            if(((Magnetic) element).magnetic_type() == 0){
                                System.out.println(element + " is ferromagnetic with strength of " + ((Magnetic) element).magnetic_strength());
                            }else{
                                System.out.println(element + " is paramagnetic with strength of " + ((Magnetic) element).magnetic_strength());
                            }
                            counter++;
                        }
                    }

                    for(Alloy alloy : alloys){
                        if(alloy instanceof Magnetic){
                            if(((Magnetic) alloy).magnetic_type() == 0){
                                System.out.println(alloy + " is ferromagnetic with strength of " + ((Magnetic) alloy).magnetic_strength());
                            }else{
                                System.out.println(alloy + " is paramagnetic with strength of " + ((Magnetic) alloy).magnetic_strength());
                            }
                            counter++;
                        }
                    }

                    if(counter == 0){
                        System.out.println("No magnetic materials present");
                    }

                    break;
                case "Conduct":
                    // TODO Radiate here
                    counter = 0;

                    for(Element element : elements){
                        if(element instanceof Conductive){
                            System.out.printf("%s conductivity is %.1f%%\n",element,
                                    ((Conductive) element).percent_conductive()*100);
                            counter++;
                        }
                    }

                    for(Alloy alloy : alloys){
                        if(alloy instanceof Conductive){
                            System.out.printf("%s conductivity is %.1f%%\n",alloy,
                                    ((Conductive) alloy).percent_conductive()*100);
                            counter++;
                        }
                    }

                    if(counter == 0){
                        System.out.println("No conductive materials present");
                    }

                    break;
                case "Alloy Components":
                    // TODO Radiate here
                    counter = 0;
                    for(Alloy alloy : alloys){
                        System.out.println(alloy + " consists of " + alloy.elements.get(0).getName() + ", " + alloy.elements.get(1).getName());
                        counter++;
                    }

                    if(counter == 0){
                        System.out.println("No alloys present");
                    }

                    break;
                case "Get State":
                    System.out.print("Enter temperature: ");
                    double temp = sc.nextDouble();
                    sc.nextLine(); // This is to clear the newline
                    // TODO print state of elements
                    for(Element element : elements){
                        if(element.state((float)temp) == 0){
                            System.out.println(element + " is solid");
                        }else if(element.state((float)temp) == 1){
                            System.out.println(element + " is liquid");
                        }else{
                            System.out.println(element + " is gas");
                        }
                    }
                    break;
                case "Sort by Weight":
                    Collections.sort(elements);
                    for (Element e : elements) {
                        System.out.println(e + " = " + e.getAtomicWeight());
                    }
                    if (elements.isEmpty()) {
                        System.out.println("No elements present");
                    }
                    break;
            }
        } while (!input.equals("DONE"));
    }
}
