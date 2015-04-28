package com.github.jqxu.strategy;

public abstract class DataSet{

		private SortStrategy sortStrategy;
		
		public void setStrategy(SortStrategy  sortStrategy) {
			this.sortStrategy = sortStrategy;
		}
		
		public String sort() {
			return sortStrategy.performSort();
		}

}
