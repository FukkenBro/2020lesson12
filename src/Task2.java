import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
//        List of K sorted arrays:
//          [1, 2, 5]
//          [2, 3]
//          [1, 3, 4, 7]
//        create iterator:
//          [1, 1, 2, 2, 3, 3, 4, 5, 7]
//    }

        int[][] arr = {
                {1, 2, 5},
                {2, 3},
                {1, 3, 4, 7}
        };
        MyIterator it = new MyIterator(arr);

        System.out.print("[");
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.print("]");
    }
}
