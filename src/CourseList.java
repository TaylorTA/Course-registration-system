public class CourseList {
    private Course[] courses;
    private final int MAX = 100;
    private int size;

    public CourseList(){
        courses = new Course[MAX];
        size = 0;
    }

    public boolean contains(Course target){
        for(int i=0; i<size; i++){
            if(courses[i] == target)
                return true;
        }
        return false;
    }

    public void addCourse(Course newCourse){
        if(size >=MAX){
            return;
        }else{
            courses[size] = newCourse;
            size++;
        }
    }

    public String getAllTitles(){
        String result = "";
        for(int i=0;i<size;i++)
            result += courses[i].getAllTitle()+"\n";
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0;i<size;i++)
            result += courses[i].toString()+"\n";
        return result;
    }

    public void remove(Course course) {
        int pos = -1;
        for(int i=0; i<size; i++){
            if(courses[i].equals(course))
                pos = i;
        }

        for(int i=pos; i<size-1; i++){
            courses[i] = courses[i+1];
        }
        size--;
    }
}
