package 面试.直系亲属计算器;

public class RelativeNode {
    public RelativeNode father;
    public RelativeNode mother;
    public RelativeNode son;
    public RelativeNode daughter;
    int value;

    public RelativeNode(int value) {
        this.value = value;
    }

    public RelativeNode getFather() {
        return father;
    }

    public void setFather(RelativeNode father) {
        this.father = father;
    }

    public RelativeNode getMother() {
        return mother;
    }

    public void setMother(RelativeNode mother) {
        this.mother = mother;
    }

    public RelativeNode getSon() {
        return son;
    }

    public void setSon(RelativeNode son) {
        this.son = son;
    }

    public RelativeNode getDaughter() {
        return daughter;
    }

    public void setDaughter(RelativeNode daughter) {
        this.daughter = daughter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
