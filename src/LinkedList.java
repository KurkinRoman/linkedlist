public class LinkedList {

    private Node firstNode;

    public void printList() {
        Node currentNode = firstNode;
        while (currentNode != null) {
            System.out.println("Name: " + currentNode.getPerson().getName() + ", Age: " + currentNode.getPerson().getAge());
            currentNode = currentNode.getNextNode();
        }
    }
    public void addNode(Person person) {
        Node newNode = new Node(person);
        newNode.setNextNode(firstNode);
        firstNode = newNode;
    }

    public void removeNode(Person person) {
        Node currentNode = firstNode;
        Node previousNode = null;

        while (currentNode != null) {
            if (currentNode.getPerson().equals(person)) {
                if (previousNode == null) {
                    firstNode = currentNode.getNextNode();
                }
                else {
                    previousNode.setNextNode(currentNode.getNextNode());
                }
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
    }

}
