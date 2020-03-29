import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JobScheduling {

	public static void main(String[] args) {

		JobScheduling j = new JobScheduling();
		Job[] arr = { j.new Job(1, 20, 4), j.new Job(2, 10, 1), j.new Job(3, 40, 1), j.new Job(4, 30, 1) };
		j.printJobScheduling(arr, 4);
	}

	class Job {
		int id, profit, deadline;

		Job(int id, int profit, int deadline) {
			this.id = id;
			this.profit = profit;
			this.deadline = deadline;
		}
	}

	void printJobScheduling(Job arr[], int n) {

		ArrayList<Job> jobList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			jobList.add(arr[i]);
		}

		Collections.sort(jobList, new Comparator<Job>() {

			@Override
			public int compare(Job j1, Job j2) {

				return j2.profit - j1.profit;
			}
		});

		int jobsSequenced = 0;
		int profit = 0;
		int[] profitArray = new int[n];
		while (!jobList.isEmpty()) {
			Job job = jobList.remove(0);
			int jobDeadLine = job.deadline;
			while (jobDeadLine >= 0) {

				if (jobDeadLine  > 0 && jobDeadLine  < n && profitArray[jobDeadLine - 1] == 0) {
					profitArray[jobDeadLine - 1] = job.profit;
					profit += job.profit;
					jobsSequenced++;
					break;
				} else {
					jobDeadLine--;
				}
			}

		}

		System.out.print(jobsSequenced + " " + profit);

	}

}
