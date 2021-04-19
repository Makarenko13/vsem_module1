package mak.edu.Final_course;/*
  @author   User
  @project   vsem_module_1
  @class  Duplicates
  @version  1.0.0
  @since 19.04.2021 - 19.51
*/

public class Duplicates {
    public  static  boolean hasDuplicates(int[] array){
            Arrays.sort(array);
            List inputList = Arrays.asList(input);
            Set inputSet = new HashSet(inputList);
            if(inputSet.size()< inputList.size())
                return true;
        }
        return false;
    }
        public static void main(String[] args) {
            int[] array = {1,5,3,6,2,9,33,21};
            System.out.println(hasDuplicates(array));  // false
            array[5] = 1;
            System.out.println(hasDuplicates(array)); // true
        }
    }
}
