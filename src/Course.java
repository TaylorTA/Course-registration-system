public class Course {
    private final int maxSize = 100;
    private String title;
    private String shortTitle;
    private int maxClassSize;
    private StudentList classList;
    private StudentList waitList;

    public Course(String title, String shortTitle, int maxClassSize){
        this.maxClassSize = maxClassSize;
        this.title = title;
        this.shortTitle = shortTitle;
        classList = new StudentList(maxClassSize);
        waitList = new StudentList(maxSize);
    }

    public void register(Student student){
        if(classList.contains(student)){
            System.out.println("The student " + student + " is already registered to " + shortTitle);
        } else {
            if(classList.addStudent(student)){
                System.out.println("The student "+ student + " has been registered successfully to " + shortTitle);
                student.addCourse(this);
            }else if(waitList.contains(student)){
                System.out.println("The student " + student +" is already on the wait list for " +shortTitle);
            }else if(waitList.addStudent(student)){
                System.out.println("The student " + student + " has been placed on the wait list for " + shortTitle);
            }else{
                System.out.println("The wait list is full for " + shortTitle +"!");
            }
        }
    }

    public void withdraw(Student student){
        if(classList.contains(student)){
            classList.remove(student);
            System.out.println("The student " + student + " has been withdrawn from " + shortTitle);
            student.removeCourse(this);
            if(!waitList.isEmpty()) {
                classList.addStudent(waitList.pop());
                System.out.println("The student "+ student + " has been registered successfully to " + shortTitle);
            }
        }else if (waitList.contains(student)){
            waitList.remove(student);
            System.out.println("The student " + student + " has been withdrawn from the wait list of " + shortTitle);
        }else{
            System.out.println("The student " + student + " is not on any list of " + shortTitle);
        }
    }

    public String getAllTitle(){
        return title + " - " + shortTitle;
    }

    public String toString(){
        return getAllTitle()+"\n"+"Class List: \n" + classList+"Wait List:\n"+waitList;
    }
}
