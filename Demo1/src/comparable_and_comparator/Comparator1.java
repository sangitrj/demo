package comparable_and_comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator1 {
    public static Comparator<Employee2> sortById = new Comparator<Employee2>() {
		
		@Override
		public int compare(Employee2 o1, Employee2 o2) {
			if((o1.getId()-o2.getId())==0)
				return o1.getName().compareToIgnoreCase(o2.getName());
			else
				return o1.getId()-o2.getId();
		}
	};
	public static void main(String[] args) {
		Employee2[] empArr = new Employee2[4];
		empArr[0] = new Employee2(10, "Mikey", 25, 10000);
		empArr[1] = new Employee2(20, "Arun", 29, 20000);
		empArr[2] = new Employee2(1, "Pankaj", 35, 5000);
		empArr[3] = new Employee2(1, "Lisa", 32, 3400);
		Arrays.sort(empArr,sortById);
		/*SortBySalary sortBySalary = new SortBySalary();
		Arrays.sort(empArr, sortBySalary);*/
		for(Employee2 obj : empArr)
			System.out.println(obj);
		//System.out.println(Arrays.toString(empArr));
	}
}
