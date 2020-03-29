package GreedyAlgorithms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Meeting {

	public static void main(String[] args) {

		int[] start = { 1, 3, 0, 5, 8, 5 };
		int[] end = { 2, 4, 6, 7, 9, 9 };

		maxMeetings(start, end, 6);

	}

	static void maxMeetings(int start[], int end[], int n) {

		class Job {
			int startTime;
			int finishTime;
			int originalIndex;
		}

		ArrayList<Job> jobList = new ArrayList<Job>();

		for (int i = 0; i < start.length; i++) {
			Job j = new Job();
			j.startTime = start[i];
			j.finishTime = end[i];
			j.originalIndex = i;
			jobList.add(j);
		}

		Collections.sort(jobList, new Comparator<Job>() {
			@Override
			public int compare(Job j1, Job j2) {

				return j1.finishTime - j2.finishTime;
			}

		});

		Job initialJob = jobList.remove(0);
		int currentFinishTime = initialJob.finishTime;
		ArrayList<Job> result = new ArrayList<Job>();
		result.add(initialJob);

		while (!jobList.isEmpty()) {
			Job currentJob = jobList.remove(0);
			if (currentJob.startTime >= currentFinishTime) {
				currentFinishTime = currentJob.finishTime;
				result.add(currentJob);
			}
		}

		for (Job j : result)
			System.out.print(j.originalIndex + 1 + " ");

	}

}
