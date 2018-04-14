package cornhack.util;

import java.util.ArrayList;

public class Matrix<T> {
	
	private ArrayList<ArrayList<T>> matrix;
	
	public Matrix() {
		this.matrix = new ArrayList<ArrayList<T>>();
	}
	
	public Matrix(int rows, int cols) {
		this.matrix = new ArrayList<ArrayList<T>>();
		this.size(rows, cols);
	}

	public void size(int rows, int cols) {
		ArrayList<ArrayList<T>> result = new ArrayList<ArrayList<T>>();
		for (int row = 0; row < rows; row++) {
			if (row >= matrix.size())
				break;

			for (int col = 0; col < cols; col++) {
				if (col >= matrix.get(col).size())
					break;

				result.get(row).set(col, matrix.get(row).get(col));
			}
		}
	}

	public T get(int row, int col) {
		return matrix.get(row).get(col);
	}
	
	public int[] find(T elem) {
		for (int row = 0; row < matrix.size(); row++) {
			for (int col = 0; col < matrix.get(row).size(); col++) {
				T curr = matrix.get(row).get(col);
				if (elem == curr || elem.equals(curr))
					return new int[] { row, col };
			}
		}
		return null;
	}

	public T remove(int row, int col) {
		return this.set(row, col, null);
	}

	public T set(int row, int col, T elem) {
		return matrix.get(row).set(col, elem);
	}

	public int width() {
		return matrix.get(0).size();
	}

	public int height() {
		return matrix.size();
	}

	public int length() {
		return this.height() * this.width();
	}
}