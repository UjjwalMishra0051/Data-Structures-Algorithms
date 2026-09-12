
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0;
        int j = 0;
        int room = 0;
        int res = 0;

        while (i < start.length && j < end.length) {

            if (start[i] < end[j]) {
                room++;
                i++;
                res = Math.max(res, room);
            } 
            else {
                room--;
                j++;
            }
        }

        return res;
    }
}
