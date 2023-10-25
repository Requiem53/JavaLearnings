package ThreeDimensionalShapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solid solid = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter solid: ");
        String option = sc.nextLine();
        int x, y = 0;
        System.out.print("Enter x: ");
        x = sc.nextInt();
        boolean isDefault = false;
        if(x == -1){
            isDefault = true;
        }else{
            System.out.print("Enter y: ");
            y = sc.nextInt();
        }
        // TODO get y
        switch (option) {
            case "Cuboid":
                System.out.print("Enter height: ");
                double hei = sc.nextDouble();
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter length: ");
                double len = sc.nextDouble();
                // This nextLine is to rid the next line made by the previous scan
                // Do this in the future as well, before getting a String input
                sc.nextLine();
                if(isDefault){
                    solid = new Cuboid(hei, base, len);
                }else{
                    solid = new Cuboid(x,y, hei, base, len);
                }
                break;
            case "Cube":
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                sc.nextLine();
                if(isDefault){
                    solid = new Cuboid.Cube(side);
                }else{
                    solid = new Cuboid.Cube(x,y, side);
                }
                break;
            case "Sphere":
                System.out.print("Enter diameter: ");
                double diameter = sc.nextDouble();
                sc.nextLine();
                if(isDefault){
                    solid = new Sphere(diameter);
                }else{
                    solid = new Sphere(x,y, diameter);
                }
                break;
            case "Hemisphere":
                System.out.print("Enter diameter: ");
                diameter = sc.nextDouble();
                sc.nextLine();
                if(isDefault){
                    solid = new Sphere.Hemisphere(diameter);
                }else{
                    solid = new Sphere.Hemisphere(x,y, diameter);
                }
                break;
            case "Cone":
                System.out.print("Enter base diameter: ");
                base = sc.nextDouble();
                System.out.print("Enter height: ");
                hei = sc.nextDouble();
                sc.nextLine();
                if(isDefault){
                    solid = new Cone(base, hei);
                }else{
                    solid = new Cone(x,y, base, hei);
                }
                break;
            // Add other cases for other shapes here
            default:
                System.out.println("Not a shape");
        }

        // This assert simply states that by the time the switch is done,
        // the shape should already be assigned to a particular shape
        // and is therefore not null anymore
        assert solid != null;
        System.out.println(solid);
        System.out.print("Surface Area is ");
        System.out.format("%.2f", solid.surfaceArea());
        System.out.print("\nVolume is ");
        System.out.format("%.2f", solid.volume());
    }
}