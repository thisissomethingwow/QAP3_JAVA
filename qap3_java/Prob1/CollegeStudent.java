package qap3_java.Prob1;

public class CollegeStudent extends Student {
    protected String myMajor;
    protected int myYear;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa,String major,int year){
        super(name, age, gender, idNum, gpa);

        myYear=year;
        myMajor = major;
    }
    public String getMyMajor() {
        return myMajor;
    }
    public int getMyYear() {
        return myYear;
    }
    public void setMyYear(int myYear) {
        this.myYear = myYear;
    }
    public void setMyMajor(String myMajor) {
        this.myMajor = myMajor;
    }
    public String toString(){
        return(super.toString()+" My major: "+myMajor+" My year: "+myYear);
    }
}
