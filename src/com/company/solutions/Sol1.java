package com.company.solutions;

public class Sol1 {
    public String solution(String word) {
        String res = "";

        for (int length = 1; length <= word.length(); length++) {
            for (int i = 0; i <= word.length()-length; i++) {
                String current = word.substring(i, i+length);
                StringBuilder pali = new StringBuilder();
                for (int b = current.length()-1; b >= 0; b--) {
                    pali.append(current.charAt(b));
                }

                if (pali.toString().equals(current)){
                    if(res.length() < current.length()){
                        res = current;
                    }
                }
            }
        }

        return res;
    }

//    private boolean isPalindrome(String word) {
//        StringBuilder pali = new StringBuilder();
//        for (int i = word.length()-1; i >= 0; i--) {
//            pali.append(word.charAt(i));
//        }
//        if (pali.toString().equals(word)){
//            return true;
//        }
//        return false;
//    }
}
