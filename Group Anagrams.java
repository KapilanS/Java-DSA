class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> freqofstr= new HashMap<>();
        for(String str:strs){
            String strfreq = getFrequencyString(str);
            if(freqofstr.containsKey(strfreq)){
                freqofstr.get(strfreq).add(str);
            }
            else{
                List<String> strlist=new ArrayList<>();
                strlist.add(str);
                freqofstr.put(strfreq,strlist);
            }
        }
        return new ArrayList<>(freqofstr.values());
    }
    private String getFrequencyString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
