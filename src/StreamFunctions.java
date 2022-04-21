import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFunctions {
    ArrayList<Student> st=new ArrayList<>();

    public void populate() {
        st.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        st.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        st.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        st.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        st.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        st.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        st.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        st.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        st.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        st.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        st.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        st.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        st.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        st.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        st.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        st.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        st.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

    }

    public void printDepts() {
        List<String> departments = st.stream().map(Student::getdept).distinct().collect(Collectors.toList());
        System.out.println("departments in college");
        for (String ele : departments) {
            System.out.println(ele);
        }

    }
    public void StudentsJoinedAfter2018()
    {
        List<String> namesafter2018=st.stream().filter((Student S)->(S.year>2018?true:false)).map(Student::getname).collect(Collectors.toList());

        System.out.println("Students enrolled after 2018  ");

        for(String ele:namesafter2018)
        {
            System.out.println(ele);


        }

    }//endfuntion
    public void MaleStudentsinCse()
    {

        List<String> MaleStudents=st.stream().filter((Student S)->(S.gender=="Male")&&(S.engineeringdept=="Computer Science")).map(Student::getname).collect(Collectors.toList());

        System.out.println("Male Students and computerscience");
        for(String ele :MaleStudents)
        {
            System.out.println(ele);
        }
    }

    public void malefemalestudents()
    {
        System.out.println(st.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));

    }
    public void Avgageofeachgender()
    {
        System.out.println(st.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getage))));

    }

    public void hignpertilldatenum()
    {

        Optional<Student> s=st.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getPertilldate)));
        System.out.println(s.get().name+" has highest percentage");
    }
    public void avgacctodept()
    {
        System.out.println(st.stream().collect(Collectors.groupingBy(Student::getdept,Collectors.averagingDouble(Student::getPertilldate))));
    }

    public void minagestudentinecedept()
    {
        Optional<Student> elecsmallage=st.stream().filter((Student student)->student.engineeringdept=="Electronic").collect(Collectors.minBy(Comparator.comparing(Student::getage)));
        System.out.println(elecsmallage.get().name+" is the youngest electronice student");

    }
    public void malefemalestudentsincsedept()
    {
        System.out.println(st.stream().filter((Student student)->student.getdept()=="Computer Science").collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
    }
    public void malestudentsincsedept()
    {
        List<String> MaleStudents=st.stream().filter((Student S)->(S.gender=="Male")&&(S.engineeringdept=="Computer Science")).map(Student::getname).collect(Collectors.toList());
        System.out.println("Male Students and computerscience");
        for(String ele :MaleStudents)
        {
            System.out.println(ele);
        }
    }




}
