class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Sort both strings
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Step 3: Compare sorted strings
        return Arrays.equals(sArray, tArray);
    }
}
---------------------- OR   --------------- -------------------------------

class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m<n){
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
