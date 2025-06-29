
        public class L0_basic {
            public static void main(String[] args) {
        
                StringBuilder sb = new StringBuilder("I am a educator");
                // StringBuilder sb1 = new StringBuilder(100); // 100 -> Capacity 
                
                sb.setCharAt(0, 'H');
                System.out.println(sb);
        
                sb.insert(2, "rahul");
                sb.delete(6,10);
                System.out.println(sb);
        
                sb.reverse();   
                System.out.println(sb);
            }
        }
        
        

    
