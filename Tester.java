package assn2;

public class Tester {
   
   public void ins ( List ls ) {
      System.out.println("== Test of ins op ==========");
      ls.clear();
      System.out.println(ls.ins(0,10.0));
      System.out.println(ls);
      ls.ins(0,11.1); ls.ins(1,12.2);
      System.out.println(ls);
      System.out.println(ls.ins(14,111.1));
      System.out.println(ls.ins(3,101.01));
      System.out.println(ls);
      return;
   }
   
   public void rem (List ls) {
     System.out.println("== Test of rem op ==========");
     ls.clear();
     System.out.println(ls.rem(0)); 
     System.out.println(ls);
     ls.ins(0,11.1); ls.ins(1,12.2); ls.ins(2,13.3);
     System.out.println(ls);
     System.out.println(ls.rem(0));
     System.out.println(ls.rem(1));
     System.out.println(ls); 
     System.out.println(ls.size());
     ls.ins(0,14.4); ls.ins(1,17.7);
     System.out.println(ls);
     System.out.println(ls.rem(1));
     System.out.println(ls); 
     System.out.println(ls.rem(100));
     System.out.println(ls);
     return;
   }
   
   public void get (List ls) {
     System.out.println("== Test of get op ==========");
     ls.clear();
     System.out.println(ls.get(0)); 
     System.out.println(ls);
     ls.ins(0,11.1); ls.ins(1,12.2); ls.ins(2,13.3);
     System.out.println(ls);
     System.out.println(ls.get(0));
     System.out.println(ls.get(1));
     System.out.println(ls.get(100));
     System.out.println(ls); 
     System.out.println(ls.size());
     ls.ins(0,14.4); ls.ins(1,17.7);
     System.out.println(ls);
     System.out.println(ls.get(1));
     System.out.println(ls); 
     System.out.println(ls.get(-100));
     System.out.println(ls);
     return;
   }
   
   public void find (List ls) {
     System.out.println("== Test of find op =========");
     ls.clear();
     System.out.println(ls.find(12.2));
     ls.ins(0,11.1);
     System.out.println(ls.find(11.1));
     System.out.println(ls.find(12.2));
     ls.ins(0,22.2); ls.ins(1,33.3); ls.ins(0,44.4);
     System.out.println(ls.find(33.3));
     System.out.println(ls.find(11.1));
     System.out.println(ls.find(-5.5));
     ls.clear();
     System.out.println(ls.find(11.1));
     return;
   }

   public void isEmpty (List ls) {
      System.out.println("== Test of isEmpty op =======");
      ls.clear();
      System.out.println(ls.isEmpty());
      ls.ins(0,1.1);
      System.out.println(ls.isEmpty());
      ls.ins(0,2.2);
      System.out.println(ls.isEmpty());
      ls.rem(0);
      System.out.println(ls.isEmpty());
      ls.rem(100);
      System.out.println(ls.isEmpty());
      ls.rem(0);
      System.out.println(ls.isEmpty());
      return;
   }
   
   public void contains(List ls) {
      System.out.println("== Test of contains op ======");
      ls.clear();
      return;
   }
   
   public void size (List ls) {
      System.out.println("== Test of size op ==========");
      ls.clear();
      System.out.println(ls.size());
      ls.ins(0,1.1); System.out.println(ls.size());
      ls.ins(0,2.2); System.out.println(ls.size());
      for (int i=2; i<20; i++) { ls.ins(i,i*1.1); }
      System.out.println(ls.size());
      for (int i=0; i<5; i++) { ls.rem(0); }
      System.out.println(ls.size());
      ls.clear();
      System.out.println(ls.size());
      return;
   }
   
   public void clear (List ls) {
      System.out.println("== Test of clear op =========");
      System.out.println(ls.size());
      double n = ls.get(0);
      System.out.println(ls.find(n));
      ls.clear();
      System.out.println(ls.size());
      System.out.println(ls.get(0));
      System.out.println(ls.get(100));
      System.out.println(ls.find(n));
      return;
   }

    public void set ( List ls ) {
        System.out.println("== Test of set op ==========");
        ls.clear();
        ls.ins(0,8.2);
        ls.ins(1,-7.3);
        ls.ins(2,3.4);
        ls.ins(3,5.0);
        ls.ins(4,3.4);
        ls.ins(5,2.1);
        System.out.println(ls);
        System.out.println(ls.set(2, 1.9));
        System.out.println(ls);
        return;
    }

    public void inSort ( List ls ) {
        System.out.println("== Test of insort op ==========");
        ls.clear();
        ls.ins(0, 1.2);
        ls.ins(1, 5.5);
        ls.ins(2, 17.03);
        ls.ins(3, 12.8);
        ls.ins(4, 6.6);
        System.out.println(ls);
        System.out.println(ls.inSort(2.1));
        System.out.println(ls);
        return;
    }
    public void findLast ( List ls ) {
        System.out.println("== Test of findlast op ==========");
        ls.clear();
        ls.ins(0,8.2);
        ls.ins(1,1.9);
        ls.ins(2,3.4);
        ls.ins(3,5.0);
        ls.ins(4,1.9);
        ls.ins(5,2.1);
        System.out.println(ls);
        System.out.println(ls.findLast(1.9));
        System.out.println(ls);
        return;
    }

    public void bubbleIns ( List ls ) {
        System.out.println("== Test of bubbleins op ==========");
        ls.clear();
        ls.ins(0,8.2);
        ls.ins(1,1.9);
        ls.ins(2,3.4);
        ls.ins(3,5.0);
        ls.ins(4,2.7);
        ls.ins(5,2.1);
        System.out.println(ls);
        System.out.println(ls.bubbleIns(7.0));
        System.out.println(ls);
        return;
    }
}


//Example: list is 1.2, 5.5, 17.03, 12.8, 6.6
//        inSort(19.0) makes this list:  1.2, 5.5, 17.03, 12.8, 6.6, 19.0