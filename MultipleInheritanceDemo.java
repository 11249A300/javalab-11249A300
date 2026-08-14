// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class C implements A, B {
   C() {
   }

   public void showA() {
      System.out.println("This is interface:A");
   }

   public void showB() {
      System.out.println("This is interface B");
   }

   public static void main(String[] var0) {
      C var1 = new C();
      var1.showA();
      var1.showB();
   }
}
