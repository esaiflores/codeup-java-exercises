public class ControlFlowExercises {
    public static void main(String[] args) {

//        Loop Basics

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//
//        }

//        Do While

//       long i = 2;
//       int i = 100;
//
//       do {
//           System.out.println(i);
//             i  -=5;
//       }while(i >= -10);

//        System.out.println(i);
//           i *= i;
//       }while(i < 1000000);
//       }

        //refactor with 4 loop

//       for (int i = 100; i >= -10; i -= 5) {
//           System.out.println(i);
//       }

        for (long i = 2; i < 1000000; i *= i) {
            System.out.println(i);

        }
    }
}
