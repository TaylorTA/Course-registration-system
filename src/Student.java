public class Student {
    private String firstName;
    private String lastName;
    private int number;
    private CourseList courses;

    public Student(String firstName, String lastName, int number){
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        courses = new CourseList();
    }

    public void addCourse(Course course){
        courses.addCourse(course);
    }

    public String getCourseListString(){
        return "Student " + this +" registered to:\n" + courses.getAllTitles();
    }

    @Override
    public String toString() {
        return lastName+", "+ firstName+" (" + number+")";
    }

    public boolean equals(Student other){
        boolean result = true;
        if(!firstName.equals(other.firstName)){
            result = false;
        }else if(!lastName.equals(other.lastName)){
            result = false;
        }else if(number != other.number){
            result = false;
        }

        return result;
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }
}
