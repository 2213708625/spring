package cycle.bean;
/**
 * @projectName: spring
 * @package: cycle.bean
 * @className: Husband
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/19 10:33
 * @version: 1.0
 */
public class Husband {
    private String name;
    private Wife wife;

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public Husband(String name, Wife wife) {
        this.name = name;
        this.wife = wife;
    }

    public Husband() {
    }
}
