package freefantasy.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @projectName: spring
 * @package: freefantasy.bean
 * @className: collection
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/15 14:29
 * @version: 1.0
 */
public class collection {
    private List<String> names;
    private Set<String> namesets;
    private Map<Integer,String> namemaps;
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "collection{" +
                "names=" + names +
                ", namesets=" + namesets +
                ", namemaps=" + namemaps +
                ", properties=" + properties +
                '}';
    }

    public void setNamemaps(Map<Integer, String> namemaps) {
        this.namemaps = namemaps;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setNamesets(Set<String> namesets) {
        this.namesets = namesets;
    }
}
