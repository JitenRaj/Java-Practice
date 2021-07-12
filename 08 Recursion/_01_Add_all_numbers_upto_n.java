/**
 * _01_Add_all_numbers_upto_n
 */
public class _01_Add_all_numbers_upto_n {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
      
    
    public static int sum(int num) {
        if (num > 0) {
          return num + sum(num - 1);
        } else {
          return 0;
        }
    }   
}