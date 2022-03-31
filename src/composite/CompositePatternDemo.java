package composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee CEO = new Employee("Jorge", "CEO", 30000);
		
		Employee headSales = new Employee("Roberto", "Head Sales", 20000);
		
		Employee headMarketing = new Employee("Leonardo","Head Marketing", 10000);
		
		Employee clerk1 = new Employee("Aurora", "Marketing", 10000);
		Employee clerk2 = new Employee("Monserrat", "MArketing", 10000);
		
		Employee salesExecutive1 = new Employee("Ricarda", "sales", 10000);
		Employee salesExecutive2 = new Employee("Rosa","Sales", 10000 );
		
		CEO.add(headSales);
		CEO.add(headMarketing);
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		//Print all employees of the organizatiion
		System.out.print("The CEO");
		System.out.println(CEO);
		
		//System.out.println(CEO.getSubordinate());
		
		System.out.println("CEO's direct reports");
		for (Employee e : CEO.getSubordinate()) {
			System.out.println(e);
		}
		
		System.out.println("Head Sales direct reports");
		for(Employee e : headSales.getSubordinate()) {
			System.out.println(e);
		}
		
		System.out.println("Head Marketing direct reports");
		for(Employee e : headMarketing.getSubordinate()) {
			System.out.println(e);
		}

	}

}
