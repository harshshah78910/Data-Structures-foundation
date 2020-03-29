package GreedyAlgorithms;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

	public static void main(String[] args) {
		
		FractionalKnapsack a = new FractionalKnapsack();
		Item[] arr = { a.new Item(60,10), a.new Item(100,20) };
		System.out.println(a.fractionalKnapsack(50, arr, 2));

	}

	class Item {
		int value, weight;

		Item(int x, int y) {
			this.value = x;
			this.weight = y;
		}
	}

	double fractionalKnapsack(int W, Item arr[], int n) 
	{
		
		Arrays.sort(arr, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				return i2.value  /i2.weight - i1.value / i1.weight;
			}
		});
		
		double value = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(W >= arr[i].weight)
			{
				W = W - arr[i].weight;
				value += arr[i].value;
			}
			else if(W < arr[i].weight)
			{
				value += W *  ((double)arr[i].value * 1.0)/((double)arr[i].weight * 1.0);
				break;
			}
		}
		
		return Math.round(value*100)/100;

	}

}
