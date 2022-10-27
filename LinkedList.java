package assn2;

public class LinkedList implements List {
  private Node head = null;
  private Node tail = null;
  private int size = 0;

  public boolean set(int index, double element) {

    if (index < 0 || index > this.size) {
      return false;
    }
    Node current = head;
    int i = 0;
    if (index == 0) {
      if (isEmpty()) {
        insLast(element);
        return true;
      } else {
        Node newNode = new NodeImpl(element, head);
        head = newNode;
        size++;
        return true;
      }
    } else if (index == size) {
      Node newNode = new NodeImpl(element, null);
      if (isEmpty()) {
        head = newNode;
        tail = newNode;
      } else {
        tail.setNext(newNode);
        tail = newNode;
      }
      return true;
    }
    while (current != null) {
      if (i == (index)) {
        current.setValue(element);
        return true;
      } else {
        current = current.getNext();
        i++;
      }
    }
    return true;
  }

  public int findLast(double element) {

    Node current = head;
    int last_index = 0;
    int index = 0;
    while (current != null) {
      if (current.getValue() == element) {
        last_index = index;
      }
      index++;
      current = current.getNext();
    }
    return last_index;
  }

  public boolean inSort(double elt) {
    int index = 0;
    Node current = head;
    Node after = current.getNext();

    while (current != null & after != null) {
      if (((current.getValue()) < elt) && (elt <= (after.getValue()))) {
        this.ins(index + 1, elt);
        return true;
      }

      index++;
      current = current.getNext();
      after = after.getNext();
    }

    insLast(elt);
    return true;
  }

  public boolean bubbleIns(double elt) {
    Node current = head;

    int index = 0;
    while (current != null) {
      if ((current.getValue() == elt)) {
        rem(index);
        ins(0, elt);
        return true;
      }
      index++;
      current = current.getNext();
    }
    this.ins(0, elt);
    return true;
  }

  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public void clear() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public boolean contains(double element) {
    Node current = head;
    while (current != null) {
      if (current.getValue() == element) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }

  public boolean rem(int index) {
    if (index < 0 || index >= this.size) {
      return false;
    } // bad index
    if (isEmpty()) {
      return false;
    }
    if (index == 0) { // special case... removes head
      if (this.tail == this.head) { // this is the case where list size is 1
        this.tail = null;
      }
      this.head = this.head.getNext();
      size--;
      return true;
    }
    // here we are removing a node other than head
    // walk list find the node involved
    Node curr = this.head;
    Node prev = null;
    for (int i = 0; i < index; i++) {
      prev = curr;
      curr = curr.getNext();
    }
    // now curr points to the node to remove...
    // prev points to node before it
    prev.setNext(curr.getNext());
    // special case... remove the last node
    if (curr == this.tail) {
      this.tail = prev;
    }
    size--;
    return true;
  }

  public double get(int index) {
    if (index < 0 || index >= this.size) {
      return Double.NaN;
    }
    Node current = head;
    int i = 0;
    while (i < index) {
      current = current.getNext();
      i++;
    }
    return current.getValue();
  }

  public boolean ins(int index, double element) {
    if (index < 0 || index > this.size) {
      return false;
    }
    Node current = head;
    int i = 0;
    if (index == 0) {
      if (isEmpty()) {
        insLast(element);
        return true;
      } else {
        Node newNode = new NodeImpl(element, head);
        head = newNode;
        size++;
        return true;
      }
    } else if (index == size) {
      insLast(element); // adds to last
      return true;
    }
    while (current != null) {
      if (i == (index - 1)) {
        Node temp = current.getNext();
        Node newNode = new NodeImpl(element, temp);
        current.setNext(newNode);
        size++;
        return true;
      } else {
        current = current.getNext();
        i++;
      }
    }
    return true;
  }

  public int find(double element) {
    Node current = head;
    int index = 0;
    while (current != null) {
      if (current.getValue() == element) {
        return index;
      }
      index++;
      current = current.getNext();
    }
    return -1;
  }

  private void insLast(double element) {
    // adds always to end of the list, always extends the list
    // and makes the size go up by one
    // this is a helper method
    Node newNode = new NodeImpl(element, null);
    if (isEmpty()) {
      head = newNode;
      tail = newNode;
      size++;
    } else {
      tail.setNext(newNode);
      tail = newNode;
      size++;
    }
  }

  public String toString() {
    // creates String representation of the list
    if (this.size == 0) {
      return "[empty]";
    }
    String list = "";
    Node current = head;
    while (current != null) {
      if (current.getNext() == null) {
        list += current.getValue();
      } else {
        list += current.getValue() + " -> ";
      }
      current = current.getNext();
    }
    return list;
  }
}
