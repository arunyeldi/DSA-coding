class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] array = new int[26];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        for(int i=0; i<sentence.length(); i++) {
            char c = sentence.charAt(i);
            int ascii = c;
            array[(ascii - 97)] = 1;
        }
        for(int i=0; i<array.length; i++) {
            if(array[i] != 1) return false;
        }
        return true;
    }
}