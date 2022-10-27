package assn2;

public interface List {
  // ArrayList Methods

  public boolean ins(int index, double element);
  /* standard list insert... go to the position in the list given by index,
  make room for the new element by moving elements at index and further
  up one location (to a higher index) so the new element goes in the
  "hole" that is opened
  */
  public boolean rem(int index);
  /* goes to location in the list given by index and moves all elements further
  along down one position...
  the element that was in location index is gone after the op completes
  */
  public double get(int index);
  /* returns the element value stored in the list at location given by index
   */
  public boolean contains(double element);
  /* returns true if the given element is stored in some list item
   */
  public int find(double element);
  /* find returns the index of the item where
  element is stored; this locates the first occurrance
  */
  public int size();
  /* returns the count of how many items are in the list
   */
  public boolean isEmpty();
  /* checks if list is empty return true if it is or false
     if it is not
  */
  public void clear();
  /* empty all elements from the list... size() becomes 0;
   */

  // ================================================================
  // LinkedList Methods

  public boolean set(int index, double element);
  // sets the value at an index to the element

  public int findLast(double element);
  /* identical to find but this method
  finds the last occurance not the first */

  public boolean inSort(double element);
  /* A form of ins operations, but here we do not insert based on index;
  rather we look through the list and find the first place where there
  are two element values that "straddle" the element we are adding...
  meaning we find a spot in the list where one element is <= to the item
  we are adding, and the next element (next higher index) is > the one we
  are adding. The new element goes between these two.
  If the head element is > the one we are adding, then the new element goes
  at the head; if all elements in the list are <= the one we are adding, the
  new element goes at the end.
  return true if the add succeeds (it will almost always succeed); return false
  if for some reason the insert cannot happen (such as in Array Implementation,
  the array has no room for another element).  If the list is empty, just
  insert the element into the list.
  */

  public boolean bubbleIns(double element);
  /* Another form of ins operation.  In this one, we look through the list
   to see if the element we want to add is already in the list.  If it is,
   we take the first occurrance of it and move that element to the head of
   the list.  If the element we want to add is NOT already in the list then
   we put the new element at the head.  The net effect on size is this: if
   the element is already there, the size does not change; if the element is
   not already there, then we add it as a new head so the size goes up one.
   Return true if the add succeeds (it almost always will); return false if
   for some reason the add cannot happen (such as in Array Implementation,
   the array has no room for a new element to be stored).  If the list is
   empty, just insert the element.
  */

}
