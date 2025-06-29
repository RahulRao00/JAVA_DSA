public class L1_EqualString {
    public static void main(String[] args) {
        
        String name = "Rahul";
        String name1 = "Rahul";
        String name2 = new String("Rahul");

        //  == check at object level 

        if(name == name1){
            System.out.println("Strings  equal");
        }
        else{
            System.out.println("Strings not equal ");
        }
        
        if(name == name2){
            System.out.println("Strings equal");
        }
        else{
            System.out.println("Strings not equal ");
        }

        if(name.equals(name2)){
            System.out.println("Strings equal");
        }
        else{
            System.out.println("Strings not equal ");
        }

    }
}
