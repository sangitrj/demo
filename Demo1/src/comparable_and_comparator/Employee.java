package comparable_and_comparator;

public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString(){
    	return id+" : "+name+" : "+age+" : "+salary;
    }
	@Override
	public int compareTo(Employee o) {
		/*if((this.id-o.id)>0)
			return 1;
		else if((this.id-o.id)<0)
			return -1;
		else
			return 0;*/
		return this.id - o.id;
	}

}
