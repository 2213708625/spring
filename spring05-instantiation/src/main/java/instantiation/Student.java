package instantiation;

import java.util.Date;

/**
 * @projectName: spring
 * @package: instantiation
 * @className: Student
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/17 13:58
 * @version: 1.0
 */
public class Student {
    private Date birth;

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }

    public Student(Date birth) {
        this.birth = birth;
    }

    public Student() {
    }
}
