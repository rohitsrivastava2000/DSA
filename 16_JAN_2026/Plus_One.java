class Solution {
    public int[] plusOne(int[] digits) {
        char[] arr = new char[digits.length];

        for(int i = 0; i < digits.length; i++){
            arr[i] = (char) (digits[i] + '0');
        }

        int lastVal = arr[arr.length-1] - '0';
        ++lastVal;

        for(int i = 0; i < arr.length -1; i++){
            digits[i] = (int) (arr[i] - '0');
        }
        if(lastVal == 10){
            digits[digits.length - 1] = 0;

            for(int i = digits.length - 2; i >= 0; i--){
                if(digits[i] < 9){
                    digits[i] = digits[i] + 1;
                    return digits;
                }
                digits[i] = 0;
            }
            int[] n = new int[digits.length + 1];
            n[0] = 1;
            return n;
        }
        digits[digits.length -1] = lastVal;
        return digits;
    }
}