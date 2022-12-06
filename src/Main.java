public class Main
{
    public static void main(String[] args)
    {
        Student Alan = new Student("Alan", "Turing", 191254, 3.56f, true);
        Student Florance = new Student("Florance", "Nightingale", 182010, 3.89f, false);
        Student Grace = new Student("Grace", "Hopper", 190692, 3.99f, true);
        System.out.println(Alan.toString());
        System.out.println();
        Florance.setID(95366);
        Florance.setGPA(3.92f);
        System.out.println("Florance's ID: " + Florance.getID());
        System.out.println("Florance's GPA: " + Florance.getGPA() + "\n");
        System.out.println("Grace's first name: " + Grace.getFirstName());
        System.out.println("Grace is a CS student: " + Grace.getCSStudent() + "\n");
        System.out.println(Alan.CreateID());
        System.out.println(Florance.CreateID());
        System.out.println(Grace.CreateID());
        System.out.println(Alan.CsGPA());
        System.out.println(Florance.CsGPA());
        System.out.println(Grace.CsGPA());
    }
}