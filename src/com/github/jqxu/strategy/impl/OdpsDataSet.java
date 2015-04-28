package com.github.jqxu.strategy.impl;

import com.github.jqxu.strategy.DataSet;
import com.github.jqxu.strategy.SortStrategy;

public class OdpsDataSet extends DataSet {

	public OdpsDataSet() {
		super();		
		 //odps is very large data sets..so it have to take merge sort
		super.setStrategy(new MergeSortStrategy());
	}
}
