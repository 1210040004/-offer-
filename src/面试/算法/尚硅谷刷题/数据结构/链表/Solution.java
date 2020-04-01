package 面试.算法.尚硅谷刷题.数据结构.链表;

public class Solution {
    // 链表是以节点的方式来存储的
    // 每个节点包含data 域， next 域 ： 指向下一个节点
    // 链表的各个节点不一定是连续存储的
    // 链表分带头结点的链表和没有头节点的链表
      class HeroNode{
          int no;
          String name;
          String nickName;
          HeroNode next;

        public HeroNode(int no, String name, String nickName) {
            this.no = no;
            this.name = name;
            this.nickName = nickName;
        }

        @Override
        public String toString() {
            return "HeroNode{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    ", nickName='" + nickName + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

    }
    class SingleLinkedList{
          // 初始话头节点， 不存放具体数据
          private HeroNode head= new HeroNode(0,"","");
          // 添加到单向链表
          // 不考虑编号顺序的时候
         //  找到
          public void add(HeroNode head){

          }
    }
}
