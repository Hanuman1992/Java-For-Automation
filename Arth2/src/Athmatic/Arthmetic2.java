package Athmatic;//----(((((10*2)-2)+2)-2)/2)

public class Arthmetic2 
{
 public int multi(int a,int b)
 {
 int c;
 c=a*b;
 System.out.println("Multi result is"+ c);
 return c;
 }
 public int sub(int d,int e)
 {
	 int f;
	 f= d-e;
	 System.out.println("sub result is"+f);
	 return f;
 }
 public int sum(int g,int h)
 {
	 int i;
	 i= g+h;
	 System.out.println("sumresult is"+ i);
	 return i;
 }
 public int div (int j, int k)
 {int l;
 l=j/k;
 System.out.println("divresult is"+ l);
 return l;
 }
 public static void main(String[] args)
 {
 Arthmetic2 pillu=new Arthmetic2();
 int multiresult=pillu.multi(10,2);
 int subresult=pillu.sub(multiresult,2);
 int sumresult=pillu.sum(subresult,2);
 int subresult1=pillu.sub(sumresult,2);
 int divresult=pillu.div(subresult1,2);
 
 System.out.println("result of equation (((((10*2)-2)+2)-2)/2) is = "+ divresult);
}}
 
 
