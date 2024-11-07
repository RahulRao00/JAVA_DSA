
public class basicBuilder {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Rahul");
        System.out.println(sb);
        

        // char ch = 'a';
        for(char ch = 'a'; ch < 'z'; ch++ ) {
            sb.append(ch);
        }
        System.out.println(sb);

    }
}

