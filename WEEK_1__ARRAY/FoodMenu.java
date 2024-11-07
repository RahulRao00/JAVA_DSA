   import java.util.*;
   public class FoodMenu {
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            String[] menu = {"Dosa ","Coffee","Tea","Samosa","Choley Bature","Sandwich","Pizza","Chilly Potato","Ice cream","Biryani","Juice"};
            System.out.print("Enter your order : ");
            String order = sc.nextLine();

            for(int i = 0;i < menu.length;i++){

                if(menu[i].equals(order)){
                    System.out.println(order + " Food found ");
                    break;
                }
                // else{
                //     System.out.println( order +" Not in the menu ,Try something other items ");
                //     break;
                // }
            }
            sc.close();
        }
    }
