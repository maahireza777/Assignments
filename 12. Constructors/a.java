class a
{

    a(int i)
    {
        System.out.println(i);
    }

    public static void main(String args[])
    {
        int x = 10;
        while( x > 0)
        {
           a b = new a(x);
	x--;
        }
    }
}