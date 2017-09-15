import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(this.students!=null)
			return students;

		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException;
		else
		this.students.add(students);
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException;
		else
			return students[index];
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if (student == null) 
			throw new IllegalArgumentException;
		if(index<0||index>=students.length)
			throw new IllegalArgumentException;
		students[index]=student;

	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if (student == null) 
			throw new IllegalArgumentException;
		for(int i=students.length;i>=0;i--)
		{
			students[i+1]=students[i];
		}
		students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if (student == null) 
			throw new IllegalArgumentException;
		students[students.length]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if (student == null) 
			throw new IllegalArgumentException;
		if(index<0||index>students.length)
			throw new IllegalArgumentException;
		for(int i=students.length;i>=index;i--)
		{
			students[i+1]=students[i];
		}
		students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0||index>students.length)
			throw new IllegalArgumentException;
		for(int i=index;i<students.length;i++)
		{
			students[i]=students[i+1];
		}
		students[i]=null;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if (student == null) 
			throw new IllegalArgumentException;
		int index=-1 ;
		for(int i=0;i<students.length;;i++){
			if(students[i]==student)
			{	index=i;break;
			}

		}
		if(index==-1)
			throw new IllegalArgumentException("Student not exist");
		else{
		for(int i=index;i<students.length;i++)
		{
			students[i]=students[i+1];
		}
		students[i]=null;}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0||index>students.length)
			throw new IllegalArgumentException;
		for(int i=index+1;i<students.length;i++)
		{
			students[i]=null;
		}

	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if (student == null) 
			throw new IllegalArgumentException;
		int index=-1 ;
		for(int i=0;i<students.length;;i++){
			if(students[i]==student)
			{	index=i;break;
			}

		}
		if(index==-1)
			throw new IllegalArgumentException("Student not exist");
		else{
		for(int i=index+1;i<students.length;i++)
		{
			students[i]=null;
		}
		}

	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0||index>students.length)
			throw new IllegalArgumentException;
		for(int i=index,j=0;i<students.length;i++,j++)
		{
			students[j]=students[i];
		}
		for(int i=j;i<students.length;i++)
		{
			students[i]=null;
		}

	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if (student == null) 
			throw new IllegalArgumentException;
		int index=-1 ;
		for(int i=0;i<students.length;;i++){
			if(students[i]==student)
			{	index=i;break;
			}

		}
		if(index==-1)
			throw new IllegalArgumentException("Student not exist");
		else{

		for(int i=index,j=0;i<students.length;i++,j++)
		{
			students[j]=students[i];
		}
		for(int i=j;i<students.length;i++)
		{
			students[i]=null;
		}}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Student student1;
		for(int i=0;i<students.length-1;i++)
		{
			for(int j=i+1;i<students.length;j++)
		{
			if(!students[i].compareto(students[j]) )
			{
					student1=students[i];
					students[i]=students[j];
					students[j]=student1;
			}
		}
		}

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		students[] s2;

		if(date==null)
			throw new IllegalArgumentException;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getByBirthDate<date)
				s2.add(students[i]);
		}
		if(s2!=null)
		return s2;
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		students[] s2;

		if(firstdate==null||lastDate==null)
			throw new IllegalArgumentException;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getByBirthDate<lastdate&&students[i].getByBirthDate>firstdate)
				s2.add(students[i]);
		}
		if(s2!=null)
		return s2;
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here

		if(date==null)
			throw new IllegalArgumentException;		
		Date d1=date.setDate(date.getDate+days)
		Date d2=date.setDate(date.getDate-days)
		students[] s2;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getByBirthDate<d1&&students[i].getByBirthDate>d2)
				s2.add(students[i]);
		}
		if(s2!=null)
		return s2;
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(indexOfStudent==0)
			throw new IllegalArgumentException;	
		return(2017-students[indexOfStudent].getByBirthDate().getYear());
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		students[] s2;
		for(int i=0;i<students.length;i++)
		{
			if(age==(2017-students[indexOfStudent].getByBirthDate().getYear()))
				s2.add(students[i]);
		}
		return s2;
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		int max=0;
		students[] s2;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getAvgMark()>max)
				max=students.getAvgMark();
		}
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getAvgMark()==max)
				s2.add(students[i]);
		}
		if(s2!=null)
		return s2;
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException;		
		for(int i=0;i<students.length;;i++){
			if(students[i]==student)
			{	break;
			}

		}
		if(i<students.length-1)
			return(students[i+1]);
		return null;
	}
}
