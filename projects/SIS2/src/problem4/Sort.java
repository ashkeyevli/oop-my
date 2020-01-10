package problem4;

import lab2_4.Time;

public class Sort {
	static <E> void swap(E [] array, int i, int j) {
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	static <E extends Comparable<E>> void BubbleSort(E [] array) {
		 for(int j = 1; j < array.length; j++) {
	        for(int i = 0; i < array.length - j; i++) {
	            if(array[i].compareTo(array[i+1]) > 0) {
	               swap(array, i, i+1);
	            }
	        }
	     }
	}
	
	
	static <E extends Comparable<E>> void mergeSort(E [] arr, int start, int end) {
if (start >= end) return;
		int mid = (start + end)/2;

		mergeSort(arr, mid, start);

		mergeSort(arr, end, mid + 1);

		merge(arr,start, mid, end);}
	@SuppressWarnings("unchecked")
private static <E extends Comparable<E>> void merge(E[] arr, int start, int mid, int end) {
	int n = end - start + 1;
	int left = start;
	int right = mid + 1;
	E[] temp = (E[]) new Comparable[n];
	for(int i = 0; i < n; i++) {
		if(left > mid) {
			temp[i] =  arr[right];
			right++;
		}
		else if(right > end) {
			temp[i] = arr[left];
			left++;
		}
		else if((int)arr[left] >= (int)arr[right]) {
			temp[i] = arr[right];
			right++;
		} else {
			temp[i] =arr[left];
			left++;
		}
	}
	for(int i = 0; i < n; i++) {
		arr[i + start] = temp[i];
	}
	
	
}

	
}
