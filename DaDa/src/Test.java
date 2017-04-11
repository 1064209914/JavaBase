/**
 * 答答租车系统
 */
import java.util.*;
public class Test {

	public static void main(String[] args) {
		System.out.println("欢迎使用答答租车系统");
		System.out.println("您是否要租车：1是 0 否");
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();				//判断是否租车
		if(a==1){
			System.out.println("您可租车的类型及其价目表：");						//打印价目表
			System.out.println("序号"+"\t"+"汽车名称"+"\t"+"租金"+"\t"+"容量");
			Che c7=new GJ();					//new出6个对象
			Che c8=new GJ();					
			PK  c9=new PK();
			Che c10=new GJ();
			Che c11=new HuoChe();
			Che c12=new HuoChe();
			c7.print(1, "奥迪A4", 500, 4);
			System.out.println();
			c8.print(2, "马自达6", 400, 4);
			System.out.println();
			c9.print(3, "皮卡雪6", 450, 4);
			c9.play(2);
			c10.print(4, "金龙",800 , 20);
			System.out.println();
			c11.print(5, "松花江", 400, 2);
			c12.print(6, "依维柯", 1000, 20);				//价目表 结束
			System.out.println("请您输入想租汽车的数量");
			int num=in.nextInt();					//将用户输入的序号以数组的形式存起来
			int[] hao=new int[num];
		for(int i=0;i<=num-1;i++){
			System.out.println("请输入第"+(i+1)+"车的序号：");
			 hao[i]=in.nextInt();				
		}	
			int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;				//计算需要付多少钱
			for(int h:hao){
				if (h==1) {
					c1++;
				}else if(h==2) {
					c2++;
				}else if(h==3){
					c3++;
				}else if(h==4){
					c4++;
				}else if(h==5){
				c5++;
			}else {
				c6++;
			}
			}
			System.out.println("请输入租车的天数");
			int day=in.nextInt();
			int zong=(c1*500+c2*400+c3*450+c4*800+c5*400+c6*1000)*day;
			System.out.println("您需要支付："+zong+"元");
			
		
		}else{
			System.out.println("欢迎下次使用！");
		}
	}

}
