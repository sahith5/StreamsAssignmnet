public class Student {
//    Make a Student class having fields id,name,age,gender,engDepartment,year of enrollment ,perTillDate

    int id;
    String name;
    int age;
    String gender;
    String engineeringdept;
    int year;
    double pertilldate;
    Student(int id, String name, int age,String gender,String engineeringdept,int year,double pertilldate)
    {
        this.age=age;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engineeringdept=engineeringdept;
        this.year=year;
        this.pertilldate=pertilldate;
    }
    public String getdept()
    {
        return this.engineeringdept;
    }
    public String getname()
    {
        return this.name;
    }
    public String getGender()
    {
        return this.gender;
    }
    public int getage()
    {
        return age;
    }
    public double getPertilldate()
    {
        return pertilldate;
    }




}
