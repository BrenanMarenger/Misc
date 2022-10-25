package searchandsort;

import java.util.List;

public class SearchAndSort {
	public static void bubbleSort(double[] data) {
		int length = data.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (data[j] > data[j + 1]) {
					double temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;

				}
			}
		}
	}

	public static void bubbleSort(List<Double> data) {
		double temp;
		int size = data.size();
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (data.get(j) > (data.get(j + 1))) {
					temp = data.get(j);
					data.set(j, data.get(j + 1));
					data.set(j + 1, temp);
				}
			}
		}

	}

	public static void selectionSort(double[] data) {
		int length = data.length;
		for (int i = 0; i < length; i++) {
			double minValue = data[i];
			int minIndex = i;
			for (int j = i; j < length; j++) {
				if (data[j] < data[minIndex]) {
					minValue = data[j];
					minIndex = j;
				}
				if (minValue < data[i]) {
					double temp = data[i];
					data[i] = data[minIndex];
					data[minIndex] = temp;
				}
			}

		}

	}

	public static void selectionSort(List<Double> data) {
		int size = data.size();
		for (int i = 0; i < size; i++) {
			double minValue = data.get(i);
			int minIndex = i;
			for (int j = i; j < size; j++) {
				if (data.get(j) < data.get(minIndex)) {
					minValue = data.get(j);
					minIndex = j;
				}
				if (minValue < data.get(i)) {
					double temp = data.get(i);
					data.set(i, data.get(minIndex));
					data.set(minIndex, temp);
				}
			}

		}
	}

	public static int binarySearch(double[] data, double value) {
		int length = data.length;
		int low = 0;
		int high = length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (data[mid] == value) {
				return mid;
			} else if (data[mid] < value) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static int binarySearch(List<Double> data, double value) {
		int size = data.size();
		int low = 0;
		int high = size - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (data.get(mid) == value) {
				return mid;
			} else if (data.get(mid) < value) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
