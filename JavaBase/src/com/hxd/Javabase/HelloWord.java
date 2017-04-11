package com.hxd.Javabase;
/*
 * 1、 考试成绩已保存在数组 scores 中，数组元素依次为 89 , -23 , 64 , 91 , 119 , 52 , 73

2、 要求通过自定义方法来实现成绩排名并输出操作，将成绩数组作为参数传入

3、 要求判断成绩的有效性（ 0—100 ），如果成绩无效，则忽略此成绩
 */
import java.util.Arrays;
public class HelloWord {

	public static void main(String[] args) {
		int[] scores={89,-23,64,91,119,52};
		System.out.println("成绩前三名:");
		HelloWord helloworld=new HelloWord();
		helloworld.toop3(scores);

	}

	public void toop3(int[] scores){
	  Arrays.sort(scores);
	  int num=0;
	  for(int i=scores.length-1;i>=0;i--){
		  if(scores[i]<0||scores[i]>100){
			  continue;
		  }
		  num++;
		  if(num>3){
			  break;
		  }System.out.println(scores[i]);
	  }
		
	}
	
	
	
}
