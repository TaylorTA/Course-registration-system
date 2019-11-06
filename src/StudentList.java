public class StudentList {
    private Student[] students;
    private int max;
    private int size;

    public StudentList(int max){
        this.max = max;
        students = new Student[max];
        size = 0;
    }

    public boolean contains(Student target){
        for(int i=0; i<size; i++){
            if(students[i].equals(target))
                return true;
        }
        return false;
    }

    public boolean addStudent(Student newStudent){
        if(size >=max){
            return false;
        }else{
            students[size] = newStudent;
            size++;
            return true;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0;i<size;i++)
            result += students[i].toString()+"\n";
        return result;
    }

    public void remove(Student student) {
        int pos = -1;
        for(int i=0; i<size; i++){
            if(students[i].equals(student))
                pos = i;
        }

        for(int i=pos; i<size-1; i++){
            students[i] = students[i+1];
        }
        size--;
    }

    public Student pop() {
        Student result = students[0];
        for(int i=0; i<size-1; i++){
            students[i] = students[i+1];
        }
        size--;
        return result;
    }

    public boolean isEmpty() {
        if(size==0)
            return true;
        else
            return false;
    }
}
