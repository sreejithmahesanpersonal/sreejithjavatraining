package com.sreejithjava.BasicPrograms;

public class MeetingScheduler {
    public static void main(String[] args) {
        int[] startTimes = {1, 3, 0, 5, 8, 5};
        int[] endTimes = {2, 4, 6, 7, 9, 9};

        int maxMeetings = findMaxMeetings(startTimes, endTimes);
        System.out.println("Maximum number of meetings that can be scheduled: " + maxMeetings);
    }

    public static int findMaxMeetings(int[] startTimes, int[] endTimes) {
        int n = startTimes.length;
        Meeting[] meetings = new Meeting[n];

        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(startTimes[i], endTimes[i]);
        }

        // Sort meetings based on end times
        java.util.Arrays.sort(meetings, (a, b) -> a.end - b.end);

        int count = 1; // At least one meeting can be scheduled
        int lastEndTime = meetings[0].end;

        for (int i = 1; i < n; i++) {
            if (meetings[i].start >= lastEndTime) {
                count++;
                lastEndTime = meetings[i].end;
            }
        }
        return count;
    }
}

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}