import java.util.Scanner;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, String> goals = new HashMap<>();
        int choice = 0;

        System.out.println("Welcome to you to-do list for 2025!");
        while(choice != 3){
            System.out.println();
            System.out.println("1.  Enter a goal");
            System.out.println("2.  Progress");
            System.out.println("3.  Exit");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Set a goal for this year: ");
                    String newGoal = scan.nextLine();
                    int goalNum = goals.size() + 1;
                    goals.put(goalNum, newGoal);
                    System.out.println("Goal Added! " + newGoal);
                    break;
                case 2:
                    System.out.println("Your list this 2025: ");
                    if(goals.isEmpty()){
                        System.out.println("Not listed yet....");
                    }else{
                        for(Integer key : goals.keySet()){
                            System.out.println(key + "." + goals.get(key));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using this program... adios!");
                    break;
                default:
                    System.out.println("Invalid choice! ");
                    break;
            }
        }
        scan.close();
    }

}

