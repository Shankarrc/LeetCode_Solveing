class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int days[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int astart=today(arriveAlice,days);
        int aend=today(leaveAlice,days);
        int bstart=today(arriveBob,days);
        int bend=today(leaveBob,days);
        int start=Math.max(astart,bstart);
        int end=Math.min(aend,bend);
        return Math.max(0,end-start+1);

    }
    public int today(String date,int days[] ){

        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3,5));

        int tot=0;
        for(int i=0;i<month-1;i++){
            tot+=days[i];
        }
        return tot+day;
    }
}