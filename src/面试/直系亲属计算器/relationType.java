package 面试.直系亲属计算器;

import java.util.HashMap;

public enum relationType {
    fuqi(1,"夫妻关系"),
    fumu (2,"父母关系"),
    zufumu (3,"祖父关系"),
    waizufumu (4,"外祖父关系"),
    erxi (7,"儿媳"),
    nvxu(8,"女婿"),
    shu (9,"叔"),
    gu (10,"姑姑"),
    jiu (11,"舅舅"),
    yi (12,"姨"),
    bo (15,"伯父"),
    tangxiongdijiemei (13,"堂兄弟姐妹"),
    biaoxiongdijiemei (14,"表兄弟姐妹"),
    qita(16,"旁系亲属");

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private int code;
    private String description;

    relationType(int code, String description) {
        this.code = code;
        this.description = description;
    }
     public static HashMap<Integer,String> map = new HashMap<>();
    static {

        relationType[] values = relationType.values();
        for (relationType value : values) {
            map.put(value.getCode(),value.getDescription());
        }
    }
    public static boolean hasrelationship(int code){
      return false;
    }
}
