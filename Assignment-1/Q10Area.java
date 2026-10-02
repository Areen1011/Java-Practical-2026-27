import java.util.Scanner;
public class Q10Area {
    double pi=3.14;
    double a;
    double cal_area(int r)
    {
        a=pi*r*r;
        return a;
    }
    
    void display()
    {
        System.out.println("Area of circle is: "+a);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int r = sc.nextInt();
        
        Q10Area obj=new Q10Area();

        obj.cal_area(r);
        
        obj.display();

        sc.close();
    }
}
