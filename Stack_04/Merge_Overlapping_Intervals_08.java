package Stack_04;

import java.util.Arrays;
import java.util.Stack;

class Interval implements Comparable<Interval> {
    int firstTime;
    int secondTime;

    public Interval() {
    }

    public Interval(int firstTime, int secondTime) {
        this.firstTime = firstTime;
        this.secondTime = secondTime;
    }

    public int compareTo(Interval other) {
        if (this.firstTime != other.firstTime) {
            return this.firstTime - other.firstTime;
        } else {
            return this.secondTime - other.secondTime;
        }
    }
}

public class Merge_Overlapping_Intervals_08 {
    public static void main(String[] args) {
        int size = 6;
        Interval[] intervalArr = new Interval[size];
        intervalArr[0] = new Interval(22, 28);
        intervalArr[1] = new Interval(1, 8);
        intervalArr[2] = new Interval(25, 27);
        intervalArr[3] = new Interval(14, 19);
        intervalArr[4] = new Interval(27, 30);
        intervalArr[5] = new Interval(5, 12);

        Arrays.sort(intervalArr);

        Stack<Interval> st = new Stack<>();

        for (int i = 0; i < intervalArr.length; i++) {
            if (st.size() > 0 && intervalArr[i].firstTime <= st.peek().secondTime) {
                Interval tempInter = st.pop();
                st.push(new Interval(tempInter.firstTime, intervalArr[i].secondTime));
            } else if (st.size() == 0) {
                st.push(intervalArr[i]);
            } else {
                Interval tempInter = st.pop();
                System.out.println(tempInter.firstTime + " " + tempInter.secondTime);
                st.push(intervalArr[i]);
            }
        }

        while (st.size() > 0) {
            Interval tempInter = st.pop();
            System.out.println(tempInter.firstTime + " " + tempInter.secondTime);
        }
        
    }
}
