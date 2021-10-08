public class ClassNotFoundException11{
   public static void main(String args[]) {
      try {
         Class.forName("myPackage.example.Sample");
      }catch (ClassNotFoundException ex) {
         ex.printStackTrace();
      }
   }
}