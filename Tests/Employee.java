
public class Employee extends Person {

	public String office;

	public String salary;

	class dateHired {
		@Override
		public String toString() {
			return "dateHired [year=" + year + ", month=" + month + ", day=" + day + "]";
		}

		public double year = 1987;
		double month = 1;
		double day = 30;

	}
}
