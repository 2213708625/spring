package bean;

/**
 * @projectName: spring
 * @package: bean
 * @className: Women
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/16 12:28
 * @version: 1.0
 */
public class Women {
    private Integer age;
    private String name;

    public Women() {
    }

    public Women(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Women{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
