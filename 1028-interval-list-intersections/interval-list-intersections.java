class Solution {
    public int[][] intervalIntersection(int[][] firstlist, int[][] secondlist) {
        
        List<int[]>res = new ArrayList<>();
        int i = 0 ;
        int j = 0 ;

        while(i < firstlist.length && j < secondlist.length){
            
                int start1 = firstlist[i][0];
                int end1 = firstlist[i][1];
                int start2 = secondlist[j][0];
                int end2 = secondlist[j][1];

                if(start1 <= start2){
                    if(end1 >= start2){
                        // find intersection 
                        int start = Math.max(start1 , start2);
                        int end = Math.min(end1 , end2);
                        res.add(new int[]{start , end});

                    }
                }
                else{ //(start2 <= start1)
                    if(end2 >= start1){
                        //find intersection
                        int start = Math.max(start1 , start2);
                        int end = Math.min(end1 , end2);
                        res.add(new int[]{start , end});
                    }
                }
                if(end1 <= end2)
                i++;
                else
                j++;

        }
        return res.toArray(new int[res.size()][]);

    }
}