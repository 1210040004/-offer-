package 面试.直系亲属计算器;

/**
 * 三代以内直系亲属计算器
 * @author  wangchaoxuan
 * 抱歉，下午有面试，题目时间来不及去做了
 */
public class Solution {

    // 对于给定a,b 两人，得出亲属关系
    public static relationType RelationshipBetweenAB(RelativeNode a, RelativeNode b){
        // 判断是否夫妻;
        if(a.daughter.equals(b.daughter) || a.son.equals(b.son)|| b.daughter.equals(a.daughter)||b.son.equals(a.son)){
            return relationType.fuqi;
        }
        // 判断是否是父母关系
        else if(a.daughter.equals(b)||a.son.equals(b) || b.daughter.equals(a)||b.son.equals(a)){
            return relationType.fumu;
        }
        // 判断是否是祖父母关系
        else if( (a.son!=null&&(a.son.son.equals(b) || a.son.daughter.equals(b))) ||(b.son!=null &&(b.son.son.equals(a) || b.son.daughter.equals(a)))){
            return relationType.zufumu;
        }
        // 判断是否是外祖父母关系
        else if((a.daughter!=null&&(a.daughter.son.equals(b)||a.daughter.daughter.equals(b)))|| b.daughter!=null&&(b.daughter.daughter.equals(a)||b.daughter.son.equals(a))){
             return relationType.zufumu;
        }
        // 其他的case因为时间原因未能写完抱歉


        return relationType.qita;
    }
    // 判定给定的a,b 两人是否是指定的亲属关系（直系还是旁系）

    /**
     *
     * @param a
     * @param b
     * @param kind 是否指定的亲属关系， 0代表直系，1 代表旁系
     * @return
     */
    public static boolean  isGivedRelationship(RelativeNode a,RelativeNode b,int kind){
        relationType relationType = RelationshipBetweenAB(a, b);
        // 三代直系亲属内
        if(relationType.getCode() <=15 && kind==0 || relationType.getCode()==16 && kind==1 ){
            return true;
        }else {
            return false;
        }
    }

}
