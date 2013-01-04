/**
 * Useful functions for manipulating numbers
 * By Eric Ponce
 */

public class Numbers {


  /**
   * Seperates an integer into digits using an assumed radix of 10.
   * @param num Number to be seperated
   * @returns An integer array holding the digits of the number
   */
  public static int [] getDigits(int num) {
    int [] digits = new int[(num + "").length()];
    int count = digits.length - 1;
        
    while (num >= 1) {
        digits[count--] = num % 10;
        num /= 10;
    }
        
    return digits;
  }
  
  public static int combineDigits(int [] arr) {
    int sum = 0;
    int radix = 1;
    
    for (int i = arr.length - 1; i > -1; i--) {
        sum += arr[i] * radix;
        radix *= 10;
    }
    
    return sum;
  }

  public static int sumOfDigits(int num) {
    int sum = 0;
    while (num >= 1) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
  
  private static int [] reverseArray(int [] arr) {
    int [] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        newArr[i] = arr[arr.length - 1 - i];
    }
    return newArr;
  }
    
  public static int reverseNumber(int num) {
    int [] digits = getDigits(num);
    digits = reverseArray(digits);
    return combineDigits(digits);
  }
  
  
}
