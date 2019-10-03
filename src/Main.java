public class Main {
    public static void main(String[] args) {
        //Question 1
        double x = 4.5;
        double z = 3.6;
        int y = 9;
        int a = 4;
        System.out.println((((y-a)*z)==x*a)||(a*z/y-x > 9000));

        //Question 2
        x += 20;
        y -= 13.5;
        System.out.println((y!=x)||(y+8.9)<=(x/5));

        //Question 3
        boolean b = ((y!=x)||(y+8.9)<=(x/5));
        boolean c = ((((y-a)*z)==x*a)||(a*z/y-x > 9000));
        System.out.println(b||c);

        //Question 4
        System.out.println((Math.abs(-300) == 50/25*150)&&(Math.sqrt(3600)/20 >= 250/2.34/90));

        //Question 5
        x /= 3;
        y *= -6.125;
        System.out.println((((y+0.5)/3 >= x)&&(x==y))||(x*y!=a*z*x)||(x/y==a/z/x));

    }
}
