package Variables;

    public class Demo1
    {
        //1: example of local & global variable

        int num3=30;     //global variable

        public void m1()
        {
            int num1=10;             //local variable
            System.out.println(num1);    //calling local variable
            System.out.println(num3);    //calling global variable
        }

        public void m2()
        {
            int num2=20;             //local variable
            System.out.println(num2);        //call local variable
//        System.out.println(num1);
            System.out.println(num3);        //call global variable
        }


        public void add(int num1, int num2)    //local variable
        {

        }

        public static void main(String[] args)
        {
            Demo1 d1=new Demo1();
            d1.m1();
            d1.m2();
        }
    }

