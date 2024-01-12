public class StudentStatsArray 
{
  private final Student[] students;

  // Constructor for students array
  public StudentStatsArray(Student[] students) 
  {
    this.students = students;
  }

  // Returns the average gpa of the students
  public double averageGpa()
  {
    double total = 0;
    for (Student s: students)
    {
      total += s.getGpa();
    }
    return total / students.length; // t
  }

  // Returns the gpa range of the students
  public double getGpaRange() 
  {
    double maxGpa = students[0].getGpa(), minGpa = students[0].getGpa();
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
    return maxGpa - minGpa;
  }

  // Returns the name of the student that has the longest length 
  public String getLongestName()
  {
    String longestName = "";
    for (Student s: students)
    {
      if (s.getName().length() > longestName.length())
        longestName = s.getName();
    }
    return longestName;
  }

  // Returns a count of the number freshman students
  public int getNumFreshman()
  {
    int numFreshman = 0;
    for (Student s: students)
    {
      if (s.getYear() == 1)
        numFreshman++;
    }
    return numFreshman;
  }

  // Returns the index of the first student with a name equal to name. 
  // Returns -1 if not found
  public int search(String name) 
  {
    for (int i = 0; i < students.length; i++)
    {
      if (students[i].getName().contains(name))
      {
        return i;
      }
    }
    return -1;
  }

  // Returns the index of the first student with a gpa greater than or equal to the gpa
  // Returns -1 if not found
  public int search(double gpa) // me when
  {
    for (int i = 0; i < students.length; i++)
    {
      if (students[i].getGpa() >= gpa)
        return i;
    }
    return -1;
  }

  // Returns 1 if the students are sorted in ascending order by their gpa; -1 if they
  // are sorted in descending order; 0 otherwise.
  public int sortStatus() 
  {
    int sort = 0;
    double prevGpa = 0;
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
    if (sort == 1)
      return sort;
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
    return sort;
  }

  // Returns the array of students in JSON format
  public String toString()
  {
    String output = "[\n";
    for (Student s : students)
    {
      output += "{\n";
      output += "\tname: " + s.getName() + ",\n";
      output += "\tgpa: " + s.getGpa() + ",\n";
      output += "\tyear: " + s.getYear() + "\n";
      output += "},\n";
    }
    output += "]";
    return output;
  }
}
