public class Program{
2.	
3.		static int x = 11;
4.		private int y = 33;
5.	
6.		public static void main(String args[]){
7.			Program pro = new Program();
8.			pro.method(5);
9.			System.out.print(Program.x);
10.			System.out.print(" " + pro.x);
11.			System.out.print(" " + pro.y);
12.		}
13.		
14.		public void method(int x){
15.			x = 10;
16.			y = 12;
17.		}
18.	}
