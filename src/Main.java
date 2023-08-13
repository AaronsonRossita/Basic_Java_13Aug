import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] intArrEmpty = new int[5];
        int[] intArr1 = {10,20,30,40};
        int[] intArr2 = intArr1; // pass by reference
        int[] intArr3 = intArr1.clone(); // pass copy

//        System.out.println("arr1[0] = " + intArr1[0]);
//        System.out.println("arr2[0] = " + intArr2[0]);
//        System.out.println("arr3[0] = " + intArr3[0]);
//        System.out.println("---------");
//        intArr2[0] = 11;
//        System.out.println("arr1[0] = " + intArr1[0]);
//        System.out.println("arr2[0] = " + intArr2[0]);
//        System.out.println("arr3[0] = " + intArr3[0]);

        String[] strArr = {"abc","def","ghi"};

//        System.out.println(intArr1[0]);
//        intArr[0] = 100;
//        System.out.println(intArr1[0]);
//
//        System.out.println(strArr[0]);
//        strArr[0] = "ABC";
//        System.out.println(strArr[0]);
//
//        intArrEmpty[0] = 11;
//        System.out.println(intArrEmpty[0]);
//        intArrEmpty[1] = 22;
//        System.out.println(intArrEmpty[1]);
//
//        System.out.println(intArr1); // print the "address" or unique index
//        System.out.println(intArr2);
//        System.out.println(intArr3);

//        int x = 5;
//        int y = x; // pass by value
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("-------");
//        y++;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);

        char[][] charMatrixArr = {
                {'a','b'},
                {'c','d','e'},
                {'f','g','h','i'}
        };

        int[][] intMatrixArr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

//        for(int[] arr : intMatrixArr){ // nested for each
//            for(int n : arr){
//                System.out.println(n);
//            }
//            System.out.println("----");
//        }

//        System.out.println(charMatrixArr[0][0]);
//        System.out.println(charMatrixArr[1][2]);
//        System.out.println(charMatrixArr[charMatrixArr.length-1][charMatrixArr[charMatrixArr.length-1].length-1]);
        String[] strArrEx = {"123","456","789","1011","1213"};
        int[] intArrEx = {101,202,303,404,505};
        int randomIndexStr = (int)(Math.random() * strArrEx.length-1 + 1);
        int randomIndexInt = (int)(Math.random() * intArrEx.length-1 + 1);

        strArrEx[randomIndexStr] = "new";
        intArrEx[randomIndexInt] = 0;

//        for(String s : strArrEx){
//            System.out.println(s);
//        }
//
//        System.out.println("-------");
//
//        for (int n : intArrEx) {
//            System.out.println(n);
//        }

//        for(int i = 0; i > -10; i -= 2){
//            System.out.println("i = " + i);
//        }
//
//        for (int i = 0; i < intArrEx.length; i++) {
//            System.out.println(intArrEx[i]);
//        }
//        for (int i = intArrEx.length-1; i >= 0 ; i--) {
//            System.out.println(intArrEx[i]);
//        }
//
//        for (int i = 0; i < intMatrixArr.length; i++) {
//            for (int j = 0; j < intMatrixArr[i].length; j++) {
//                System.out.print(intMatrixArr[i][j]);
//            }
//        }

        //{101,202,303,404,505}

//        System.out.print("{");
//        for (int i = 0; i < intArrEx.length; i++) {
//            if (i == intArrEx.length-1){
//                System.out.print(intArrEx[i]);
//            }else {
//                System.out.print(intArrEx[i] + ", ");
//            }
//        }
//        System.out.println("}");
//
//        System.out.println("{");
//        for (int i = 0; i < intMatrixArr.length; i++) {
//            System.out.print("{");
//            for (int j = 0; j < intMatrixArr[i].length; j++) {
//                if (j == intMatrixArr[i].length-1){
//                    System.out.print(intMatrixArr[i][j]);
//                }else{
//                    System.out.print(intMatrixArr[i][j] + ", ");
//                }
//
//            }
//            System.out.println("}");
//        }
//        System.out.println("}");
//
//
//        int size = 5;
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        int numberToGuess = (int)(Math.random() * 10) + 1;
//        System.out.println(numberToGuess);
//        System.out.println("Please try to guess the number");
//        int guess = scanner.nextInt();
//        int counter = 1;
//        while (guess != numberToGuess && counter != 5){
//            System.out.println("Pls try again");
//            guess = scanner.nextInt();
//            counter++;
//        }
//        if(counter == 5 && guess != numberToGuess){
//            System.out.println("Out of tries");
//        }else{
//            System.out.println("You won the number is " + guess);
//        }

        int x = 5;
        while (x != 5){
             System.out.println("while");
        }

        do{
            System.out.println("do while");
        }while (x != 5);



    }
}