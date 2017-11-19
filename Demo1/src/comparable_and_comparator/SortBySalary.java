package comparable_and_comparator;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		return (int) (o1.getSalary()-o2.getSalary());
	}

}
