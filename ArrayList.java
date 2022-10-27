package assn2;

public class ArrayList implements List {
  private double[] elts;
  private int size = 0;
  private int MAX = 1000;

  public ArrayList() {
    this.elts = new double[this.MAX];
    this.size = 0;
  }

  public ArrayList(int MAX) {
    this.elts = new double[MAX];
    this.size = 0;
    this.MAX = MAX;
  }

  public boolean set(int index, double element) {

    if (index < 0 || index > (size) || index >= this.MAX) {
      return false;
    }

    this.elts[index] = element;
    return true;
  }

  public int findLast(double element) {

    int current = -1;
    for (int i = 0; i < size; i++) {
      if (this.elts[i] == element) {
        current = i;
      }
    }
    return current;
  }

  public boolean inSort(double elt) {
    if (size == this.MAX) {
      return false;
    }

    if (((this.elts[0]) > elt) || size == 0) {
      this.ins(0, elt);
      return true;
    }

    for (int index = 0; index <= size; index++) {
      if ((this.elts[index] < elt) && (elt <= this.elts[index + 1])) {
        this.ins(index + 1, elt);
        return true;
      }
    }
    int last = 0;
    last = this.size;
    this.ins(last, elt);
    this.size++;
    return true;
  }

  public boolean bubbleIns(double elt) {
    double temp = 0;

    int loc = -1;
    for (int i = 0; i < size; i++) {
      if (this.elts[i] == elt) {
        loc = i;
        break;
      }
    }

    if (loc != -1) {
      temp = this.elts[loc];

      for (int i = loc; i < size; i++) {
        this.elts[i] = this.elts[i + 1];
      }

      for (int i = this.size; i >= 0; i--) {
        this.elts[i + 1] = this.elts[i];
      }

      this.elts[0] = temp;
      return true;
    }

    if (size >= this.MAX) {
      return false;
    }

    for (int i = this.size; i >= 0; i--) {
      this.elts[i + 1] = this.elts[i];
    }
    this.elts[0] = elt;
    this.size++;
    return true;
  }

  @Override
  public boolean ins(int index, double element) {
    if (index < 0 || index > size || index >= this.MAX) {
      return false;
    }
    for (int i = this.size; i >= index; i--) {
      this.elts[i + 1] = this.elts[i];
    }
    this.elts[index] = element;
    this.size++;
    return true;
  }

  @Override
  public boolean rem(int index) {
    if (index >= size || index < 0 || index >= this.MAX) {
      return false;
    }
    for (int i = index; i < size; i++) {
      this.elts[i] = this.elts[i + 1];
    }
    this.size--;
    return true;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public void clear() {
    this.size = 0;
  }

  @Override
  public boolean isEmpty() {
    return this.size == 0;
  }

  @Override
  public double get(int index) {
    if (index < 0 || index >= size || index >= this.MAX) {
      return Double.NaN;
    }
    return this.elts[index];
  }

  @Override
  public int find(double element) {
    int loc = -1;
    for (int i = 0; i < size; i++) {
      if (this.elts[i] == element) {
        loc = i;
        break;
      }
    }
    return loc;
  }

  @Override
  public boolean contains(double element) {
    boolean res = false;
    for (int i = 0; i < size; i++) {
      if (this.elts[i] == element) {
        res = true;
        break;
      }
    }
    return res;
  }

  /* prints out list */
  public String toString() {
    if (this.size == 0) {
      return "[empty]";
    }
    String res = "";
    for (int i = 0; i < size; i++) {
      res = res + this.elts[i] + ", ";
    }
    return res;
  }
}
