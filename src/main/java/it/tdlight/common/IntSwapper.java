package it.tdlight.common;

import it.unimi.dsi.fastutil.Swapper;

class IntSwapper implements Swapper {

	private final int[] array;
	int tmp;

	public IntSwapper(int[] array) {
		this.array = array;
		tmp = 0;
	}

	@Override
	public void swap(int a, int b) {
		tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}
