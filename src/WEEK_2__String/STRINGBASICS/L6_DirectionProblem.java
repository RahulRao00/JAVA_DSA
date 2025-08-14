package src.WEEK_2__String.STRINGBASICS;
import java.util.*;

    class L6_DirectionProblem { 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // eg. direction -> "WEENSWENSSSWEE" -> this will calculate the final destination points
            System.out.print("Enter the Direction : ");

            String direction = sc.nextLine();
            int x= 0,y = 0;
            
            for(int i = 0; i< direction.length(); i++){
                char dir = direction.charAt(i);
                if(dir == 'W'){  // NEGATIVE X direction
                    x++;
                } if(dir == 'E'){  // Positive X direction
                    x--;
                } if(dir == 'N'){   // positive Y direction
                    y++;
                } if(dir == 'S'){  // negative Y direction
                    y--;
                }
            }
            
            double sortPath = Math.sqrt( (x*x) + (y*y));
            System.out.println(sortPath);
        }
    }

    

