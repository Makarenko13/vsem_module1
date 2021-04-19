package mak.edu.Final_course;/*
  @author   Yelyzaveta Makarenko
  @project   vsem_module_1
  @class  RigthShift
  @version  1.0.0
  @since 19.04.2021 - 19.40
*/

public class RigthShift {

    public static int[] rightShift(int[] array, int step){
                {
            int[] shiftThis = {10, 20, 30, 40, 50};

            printResults(rightShift(rightShift, 2));

        }

        public static int[] rightShift(int[] argArr, int shiftBy)
        {
            int[] result = new int[argArr.length];
            int startFrom = 0;
            for(int  i = 0; i < argArr.length; ++i)
            {
                if(shiftBy + i < argArr.length)
                {
                    result[i] = argArr[shiftBy + i];
                } else {
                    result[i] = argArr[startFrom];
                    ++startFrom;
                }
            }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        System.out.println(Arrays.toString(rightShift(array2, 21))); // [50, 10, 20, 30, 40]
    }
}