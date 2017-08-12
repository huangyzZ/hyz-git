package com.hand.Exam2;

import java.util.Scanner;

/**
 * 第二题
 *	工资个人所得税计算程序
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入工资：");
        String salary = s.nextLine();
        if(salary.matches("\\d+")){
        double ss = Double.parseDouble(salary);
        double sal = ss - 3500;
        if(sal<0){
        	System.out.println("所需要缴纳的税费为"+0);
        }else{
        	if(sal<=1500){
        		sal =sal*0.03;
        	}else if(sal<=4500 && sal>=1500){
        		sal = sal*0.1;
        	}else if(sal<=9000 && sal>=4500){
        		sal = sal*0.2;
        	}else if(sal<35000  && sal>9000){
        		sal = sal*0.25;
        	}else if(sal<55000  && sal>35000){
        		sal = sal*0.3;
        	}else if(sal<80000  && sal>55000){
        		sal = sal*0.35;
        	}else if(sal>8000){
        		sal=sal*0.45;
        	}
        	System.out.println("所需要缴纳的税费为:"+sal);
        }
        }else{
        	System.out.println("请输入正确的工资！");
        System.exit(0);
    }
    }
}
