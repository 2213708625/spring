package freefantasy.bean;

import java.util.Arrays;

/**
 * @projectName: spring
 * @package: freefantasy.bean
 * @className: dinghaibin
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/15 9:57
 * @version: 1.0
 */
public class dinghaibin {
    private String[] aihaos;
    private User[] user;

    public void setUser(User[] user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "dinghaibin{" +
                "aihaos=" + Arrays.toString(aihaos) +
                ", user=" + Arrays.toString(user) +
                '}';
    }

    public void setAihaos(String[] aihaos) {
        this.aihaos = aihaos;
    }

}
