package src.WEEK_1__ARRAY;

class Basic_Array {

        public static void main(String[] args) {

            // collection of similar type of data

            // In this no need to specify the size of the array
            int arr[] = {1,2,3,4,5,6};

            // Here we have created the array of the size 10
           // int[] arr1 = new int[10];

            int[] arr1;  // declaration of array -> arr1 is getting define in the stack -> at compile time
            arr1 = new int[10];  // initialization:  actually here object is created in the memory (heap)
                                 // -> at runtime (Dynamic memory allocation(DMA) )
                                 // Heap objects may not be continuous -> depend on -> JVM

            String[] str = new String[5];
            System.out.println(str[0]);  // null -> literal
            String some = null;  // for object only ->  for reference variables


            // printing element using for each loop 
            for(int x: arr){
                System.out.println(x);
            }
        }
    }

    