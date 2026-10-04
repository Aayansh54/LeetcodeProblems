class Solution {
    public List<Integer> findSubstring(String s,String[] words) {
        int n = s.length();
        int wordLen = words[0].length();
        int totalWords = words.length;

        Map<String,Integer> wordMap = new HashMap<>();
        for(String word : words){
            wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        }

        List<Integer> ans = new ArrayList<>();

        for(int offset=0;offset<wordLen;offset++){
            int l = offset;
            int r = offset;
            int cnt = 0;
            Map<String,Integer> winMap = new HashMap<>();

            while(r + wordLen <= n){
                String word=s.substring(r,r + wordLen);
                r += wordLen;

                if(!wordMap.containsKey(word)){
                    winMap.clear();
                    cnt = 0;
                    l = r;
                    continue;
                }

                winMap.put(word,winMap.getOrDefault(word,0)+1);
                cnt++;

                while(winMap.get(word)>wordMap.get(word)){
                    String leftWord=s.substring(l,l+wordLen);
                    winMap.put(leftWord,winMap.get(leftWord)-1);
                    l += wordLen;
                    cnt--;
                }

                if(cnt==totalWords){
                    ans.add(l);

                    String leftWord=s.substring(l,l+wordLen);
                    winMap.put(leftWord,winMap.get(leftWord)-1);
                    l += wordLen;
                    cnt--;
                }
            }
        }
        return ans;
    }
}