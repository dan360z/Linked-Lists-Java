package com.company;

public class MyLinkedList {
    private MyNode firstNode;

    public String getLast() {
        return firstNode.getLast().value;
    }

    public MyNode getLastNode() {
        return firstNode.getLast();
    }

    public void appendNode(String value) {
        MyNode appendedNode = new MyNode();
        appendedNode.value = value;
        this.getLastNode().nextNode = appendedNode;
    }

}

class MyNode {
    String value;
    MyNode nextNode;

    MyNode getLast() {
        if (nextNode == null) {
            return this;
        }
        return nextNode.getLast();
    }
}
