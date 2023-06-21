public class Node {
    private Person person;
    private Node nextNode;

    public Node(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;

    }
    public Node getNextNode() {
        return nextNode;
    }
}
