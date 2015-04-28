package com.github.jqxu.strategy;

import com.github.jqxu.strategy.impl.OdpsDataSet;
import com.github.jqxu.strategy.impl.RdsDataSet;
import org.junit.*;

public class TestCase {
	
	/**
	 * strategy patterns.. using  interface  as behaviors, using abstract as common Objects,  
	 * composing them  to re-use code and loose-couple feature code..
	 * (eg..we can add HbaseDataSets with SelectSortStrategy, add RDataSets with QuickSortStrategy)
	 */
	@Test
	public void testKindsOfDataSet() {
		OdpsDataSet os = new OdpsDataSet();
		RdsDataSet rs = new RdsDataSet();
		
		Assert.assertEquals(null, os.sort(),"merge sort");
		Assert.assertEquals(null, rs.sort(),"quick sort");
		
	}
}
