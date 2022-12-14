package grokcodepattern.interval.mergeinterval;

import java.util.*;

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
  @Override
  public String toString() {
    return start+" "+end;
  }
};

class MergeIntervals {
  public static List<Interval> merge(List<Interval> intervals) {
    Collections.sort(intervals, Comparator.comparingInt(o -> o.start));

   // Collections.sort(intervals, (o1, o2) -> Integer.compare(o1.start, o2.start));
    List<Interval> mergedIntervals = new LinkedList<>();
    Iterator<Interval> itr = intervals.iterator();
    Interval interval = itr.next();
    int start = interval.start;
    int end = interval.end;
    while (itr.hasNext()) {
      interval = itr.next();
      if (end >= interval.start) {
        end = Math.max(end, interval.end);
        //System.out.println(mergedIntervals);
      } else {
        mergedIntervals.add(new Interval(start, end));
        start = interval.start;
        end = interval.end;
      }
    }
    mergedIntervals.add(new Interval(start, end));
    return mergedIntervals;
  }

  public static void main(String[] args) {
    List<Interval> input = new ArrayList<Interval>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 5));
    input.add(new Interval(7, 9));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(6, 7));
    input.add(new Interval(2, 4));
    input.add(new Interval(5, 9));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 6));
    input.add(new Interval(3, 5));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();
  }
}