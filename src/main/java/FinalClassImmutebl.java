 final class FinalClassImmutebl {

    private final int a;
    private final String b;


    public FinalClassImmutebl (int a, String b)
   {
       this.a = a;
       this.b = b;
   }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

     void print (int a, String b)
    {
        System.out.println(b + " " +  a);
    }
}
