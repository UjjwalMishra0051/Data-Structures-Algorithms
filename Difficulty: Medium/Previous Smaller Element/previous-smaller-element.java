class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> a = new ArrayList<>();
        
        a.add(-1);
        st.push(arr[0]);
        
        for(int i = 1; i < arr.length ; i++){
            
            while(! st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                a.add(-1);
            }
            else{
                a.add(st.peek());
            }
            st.push(arr[i]);
        }
        return a;
    }
}