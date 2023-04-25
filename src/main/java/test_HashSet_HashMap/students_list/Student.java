package test_HashSet_HashMap.students_list;

public class Student {
	
	private String name;
	private String nameGroup;
	private int numberStudent;
	
	public Student(String name, String nameGroup, int numberStudent) {
		this.name = name;
		this.nameGroup = nameGroup;
		this.numberStudent = numberStudent;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNameGroup() {
		return nameGroup;
	}
	
	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}
	
	public int getNumberStudent() {
		return numberStudent;
	}
	
	public void setNumberStudent(int numberStudent) {
		this.numberStudent = numberStudent;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Student student = (Student) o;
		
		return numberStudent == student.numberStudent;
	}
	
	@Override
	public int hashCode() {
		return numberStudent;
	}
	
	@Override
	public String toString() {
		return " - " +
			name + ", " +
			nameGroup + ", " +
			numberStudent;
	}
	// - Иванов Петр Николаевич, 1243-Б, 31231343
}
