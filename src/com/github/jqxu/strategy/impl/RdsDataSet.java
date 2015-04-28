package com.github.jqxu.strategy.impl;

import com.github.jqxu.strategy.DataSet;
import com.github.jqxu.strategy.SortStrategy;

public class RdsDataSet extends DataSet {
	public RdsDataSet() {
		super();
		// rds has little data,so quick sort is enough.
		super.setStrategy(new QuickSortStrategy());
	}

}
