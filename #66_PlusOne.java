/**
*
*  LC ##66---> PlusOne
*
**/

class Solution {
    public int[] plusOne(int[] digits) {
        int sum = 0;
        StringBuilder strBuild = new StringBuilder();
        String temp2 = null;

        //Concatenating the digits array to string
        for(int num : digits) {
            String temp = Integer.toString(num);
            strBuild.append(temp);
        }

        sum = Integer.parseInt(strBuild.toString());

        sum++;
        
        temp2 = Integer.toString(sum);
        
        char[] charArr = temp2.toCharArray();
        int[] result = new int[charArr.length];
        
        //Breaking the digits of array
        for(int i=0; i<charArr.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(charArr[i]));
        }

        return result;

    }
}
