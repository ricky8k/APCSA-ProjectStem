public class StudentStatsArray 
{
  // Initialize Array
  private final Student[] students;
  
  // Add private final variable to hold Students array
  public StudentStatsArray(Student[] students) 
  {
    this.students = students;
  }

  // Returns the average gpa of the students
  public double averageGpa() 
  {
    // Temporary Storage
    double total = 0;
    // Gather GPAs
    for (Student s: students)
    {
      total += s.getGpa();
    }
    // End
    return total / students.length;
  }

  // Returns the gpa range of the students
  public double getGpaRange() 
  {
    // Temporary Storage
    double maxGpa = students[0].getGpa(), minGpa = students[0].getGpa();
    // Gather GPAs
    for (Student s: students)
    {
      if (s.getGpa() > maxGpa)
      {
        maxGpa = s.getGpa();
      }
      else if (s.getGpa() < minGpa)
      {
        minGpa = s.getGpa();
      }
    }
    // End
    return maxGpa - minGpa;
  }

  // Returns the name of the student that has the longest length
  public String getLongestName() 
  {
    // Temporary Storage
    String longestName = "";
    // Check for longestName
    for (Student s: students)
    {
      if (s.getName().length() > longestName.length())
        longestName = s.getName();
    }
    // End
    return longestName;
  }

  // Returns a count of the number freshman students
  public int getNumFreshman() 
  {
    // Temporary Storage
    int numFreshman = 0;
    // Check for Freshman
    for (Student s: students)
    {
      if (s.getYear() == 1)
        numFreshman++;
    }
    // End
    return numFreshman;
  }

  // Returns the index of the first student with a name equal to name. 
  // Returns -1 if not found
  public int search(String name) 
  {
    // Search for Student
    for (int i = 0; i < students.length; i++)
    {
      if (students[i].getName().contains(name))
      {
        return i;
      }
    }
    // Not Found
    return -1;
  }

  // Returns the index of the first student with a gpa greater than or equal to the gpa
  // Returns -1 if not found
  public int search(double gpa) 
  {
    // Search for First GPA
    for (int i = 0; i < students.length; i++)
    {
      if (students[i].getGpa() >= gpa)
        return i;
    }
    // Not Found
    return -1;
  }

  // Returns 1 if the students are sorted in ascending order by their gpa; -1 if they
  // are sorted in descending order; 0 otherwise.
  public int sortStatus() 
  {
    // Temporary Storage
    int sort = 0;
    double prevGpa = 0;
    
    // Scan for Ascending Order
    prevGpa = students[0].getGpa();
    for (Student s: students)
    {
      if (s.getGpa() >= prevGpa)
      {
        sort = 1;
        prevGpa = s.getGpa();
      }
      else
      {
        sort = 0;
        break;
      }
      if (sort == 0)
        break;
    }
    // Check Order
    if (sort == 1)
      return sort;
    // Scan for Descending Order
    prevGpa = students[0].getGpa();
    for (Student s: students)
    {
      if (s.getGpa() <= prevGpa)
      {
        sort = -1;
        prevGpa = s.getGpa();
      }
      else
      {
        sort = 0;
        break;
      }
      if (sort == 0)
        break;
    }
    // End
    return sort;
  }

  // Returns the array of students in JSON like format
  public String toString() 
  {
    // Temporary Storage
    String output = "";
    // Gather Student Data
    for (Student s: students)
    {
      output += ("{\n\tname: " + s.getName() + ",\n\tgpa: " + s.getGpa() + ",\n\tyear: " + s.getYear() + "\n},");
    }
    // End
    return "[\n" + output + "\n]";
  }
}