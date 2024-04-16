package instantiation;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName: spring
 * @package: instantiation
 * @className: DateFactoryBean
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/17 13:47
 * @version: 1.0
 */
public class DateFactoryBean implements FactoryBean {
    private String strdate;

    public DateFactoryBean() {
    }

    public void setStrdate(String strdate) {
        this.strdate = strdate;
    }

    public DateFactoryBean(String strdate) {
        this.strdate =strdate;
    }

    @Override
    public Object getObject() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(strdate);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
