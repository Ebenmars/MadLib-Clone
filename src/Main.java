import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String adjective;
        String girlName;
        String adjective2;
        String occupation;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String mansName;
        String boysName;
        System.out.print("Enter an adjective: ");
        adjective = scan.nextLine();
        System.out.print("Enter a girl's name: ");
        girlName = scan.nextLine();
        System.out.print("Enter another adjective: ");
        adjective2 = scan.nextLine();
        System.out.print("Enter an occupation: ");
        occupation = scan.nextLine();
        System.out.print("Enter the name of a place: ");
        place = scan.nextLine();
        System.out.print("Enter the name of a piece of clothing: ");
        clothing = scan.nextLine();
        System.out.print("Enter the name of a hobby: ");
        hobby = scan.nextLine();
        System.out.print("Enter another adjective: ");
        adjective3 = scan.nextLine();
        System.out.print("Enter another occupation: ");
        occupation2 = scan.nextLine();
        System.out.print("Enter a boy's name: ");
        boysName = scan.nextLine();
        System.out.print("Enter a man's name: ");
        mansName = scan.nextLine();


        System.out.println("There once was a " + adjective + "girl named " + girlName + " who was a " + adjective2 + occupation
                + "in the Kingdom of " + place + "She loved to wear " + clothing + " and to" + hobby + " . She wanted to marry the orange " +
                occupation2 + " named " + boysName + " but her father, King " + mansName + " forbid her seeing him."
                );

    }
}