package revelation.control;

import revelation.service.Userservice;
import revelation.service.impl.Userserviceimpl;

/**
 * @projectName: spring
 * @package: revelation.control
 * @className: usercontrol
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/14 11:57
 * @version: 1.0
 */
public class usercontrol {
    private static Userservice userserviceimpl = new Userserviceimpl();
    public static void main(String[] args) {
        userserviceimpl.deleteservice();
    }
}
