package mak.edu.Final_course;/*
  @author   Yelyzaveta Makarenko
  @project   vsem_module_1
  @class  Prefix
  @version  1.0.0
  @since 19.04.2021 - 20.06
*/

public class CommonPrefix {
        public static String prefix(String[] array) {

            String commonPrefix="";
            int count=0, k=0;

            if(strs.length>0)
            {
                for(int i=0; i<strs[0].length(); i++)
                {
                    int j=1;
                    while(j<strs.length)
                    {
                        if(strs[0].charAt(k)==strs[j].charAt(k))
                        {
                            count++;
                            j++;
                        }
                        else
                            break;
                    }
                    if(count==strs.length-1)
                    {
                        commonPrefix+=strs[0].charAt(k);
                        count=0;
                        k++;

                    }
                    else
                    {
                        return commonPrefix;
                    }

                }

        }

        public static void main(String[] args) {
            String[] array = {"abc", "abcd", "abfce", "abcac"} ;

            System.out.println(prefix(array));  // ab

            String[] array2 = {"abc", "abcd", "abce", "abcac"} ;

            System.out.println(prefix(array2)); // abc




        }
    }

}
