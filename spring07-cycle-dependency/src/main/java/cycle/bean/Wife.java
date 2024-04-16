package cycle.bean;

/**
 * @projectName: spring
 * @package: cycle.bean
 * @className: Wife
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/19 10:34
 * @version: 1.0
 */
public class Wife {
    private String name;
    private Husband husband;

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wife(String name, Husband husband) {
        this.name = name;
        this.husband = husband;
    }

    public Wife() {
    }
}
