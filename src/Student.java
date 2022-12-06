public class Student
{
    private String firstName;
    private String lastName;
    private int id;
    private float GPA;
    private boolean CsStudent;

    public Student(String theFirstName, String theLastName, int ID, float theGPA, boolean isCsStudent)
    {
        firstName = theFirstName;
        lastName = theLastName;
        id = ID;
        GPA = theGPA;
        CsStudent = isCsStudent;
    }

    public void setFirstName(String name)
    {
        firstName = name;
    }
    public void setLastName(String name)
    {
        lastName = name;
    }
    public void setID(int id1)
    {
        id = id1;
    }
    public void setGPA(float theGPA)
    {
        GPA = theGPA;
    }
    public void setCSStudent(boolean isStudent)
    {
        CsStudent = isStudent;
    }

    public Student()
    {
        firstName = "first name goes here";
        lastName = "last name goes here";
        id = 00000000;
        GPA = 0;
        CsStudent = false;
    }
    public String CreateID()
    {
        return firstName.substring(0,1) + lastName + (id / 1000);
    }

    public Float CsGPA()
    {
        if(CsStudent == true)
        {
            return (GPA * 1.15f);
        }
        return GPA;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getID()
    {
        return id;
    }

    public float getGPA()
    {
        return GPA;
    }

    public boolean getCSStudent()
    {
        return CsStudent;
    }

    public String toString()
    {
        String output = "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nID number: " + id +
                "\nGPA: " + GPA +
                "\nThe Student is in computer science: " + CsStudent;
        return output;
    }
}
