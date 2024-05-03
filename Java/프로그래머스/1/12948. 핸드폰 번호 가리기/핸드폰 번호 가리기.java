class Solution {
    public String solution(String phone_number) {
        String star = "*";
        int len = phone_number.length();
        
        StringBuilder starStr = new StringBuilder(star.repeat(len-4));
        starStr.append(phone_number.substring(len-4, len));
        
        return starStr.toString();
    }
}