package CollectionExamples;

import java.util.Comparator;
import java.util.List;

public  class IntegerComparator implements Comparator<Integer> {
	
		@Override
		public int compare(Integer num1,Integer num2) {
			if(num1>num2) {
				return 1;
			}
			if(num1<num2) {
				return -1;
			}
			return 0;
			
		}
	}


