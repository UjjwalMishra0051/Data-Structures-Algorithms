class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<Pair<Character , Integer >> st = new Stack<>();

        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);

            if(st.isEmpty()){
                st.push(new Pair<>(c,1));

            }
            // if different character in on peek
            else if(st.peek().getKey()!=c){
                st.push(new Pair<>(c,1));

            }
            else if(st.peek().getValue() < k-1){
                //do something
                int count = st.peek().getValue();
                st.pop();
                st.push(new Pair<>(c , count +1));

            }
            // count become k remove it
            else{
                st.pop();
            }

        }
        String ans = "";
        while(!st.isEmpty()){
            Pair<Character, Integer> p = st.pop();

            for(int i = 0 ; i < p.getValue(); i++){
                ans = ans+p.getKey();

            }
        }
        return new StringBuilder(ans).reverse().toString();
    }
}