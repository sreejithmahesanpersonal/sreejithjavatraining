package com.sreejithjava.BasicPrograms;

public class MeetingSchedulerRoomsRequired {
    public static void main(String[] args) {
        int[] startTimes = {1, 3, 0, 5, 8, 5};
        int[] endTimes = {2, 4, 6, 7, 9, 9};

        int roomsRequired = findMinRoomsRequired(startTimes, endTimes);
        System.out.println("Minimum number of rooms required: " + roomsRequired);
    }

    public static int findMinRoomsRequired(int[] startTimes, int[] endTimes) {
        int n = startTimes.length;
        java.util.Arrays.sort(startTimes);
        java.util.Arrays.sort(endTimes);

        int roomsRequired = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            if (startTimes[i] < endTimes[endIndex]) {
                roomsRequired++;
            } else {
                endIndex++;
            }
        }
        return roomsRequired;
    }
}
