package test.Exam3;

import java.util.Scanner;

/**
 * 第三題
 *输入年月日，给出下一天的日期
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner s = new Scanner(System.in);
       System.out.print("请输入日期：");
       String date = s.nextLine();
       int year =Integer.parseInt(date.substring(0, date.indexOf("-"))) ;
       int mon = Integer.parseInt(date.substring(date.indexOf("-")+1,date.lastIndexOf("-")));
       int day = Integer.parseInt(date.substring(date.lastIndexOf("-")+1));
       if(mon>12||mon<0){
    	  System.out.println("输入的日期不合法"); 
    	  System.exit(0);
       }
       switch (mon) {
	case 01:
		if(day>31 || day<0){
			System.out.println("输入的日期不合法");
			System.exit(0);
		}else{
			if(day==31){
				if(mon==12){
					mon=1;
					year+=1;
				}else{
					mon= mon +1;
				}
			day = 1;
		}else
			day+=1;
       }
		break;
	case 02:
		if (((year % 100 == 0) && (year % 400 == 0))
				|| ((year % 100 != 0) && (year % 4 == 0))){
			if(day>29 || day<0){
				System.out.println("输入的日期不合法");
				System.exit(0);
			}else{
				if(day==29){
					if(mon==12){
						mon=1;
						year+=1;
					}else{
						mon= mon +1;
					}
				day = 1;
			}else
				day+=1;
			}
		}else{
			if(day>28 || day<0){
				System.out.println("输入的日期不合法");
				System.exit(0);
			}else{
				if(day==28){
					if(mon==12){
						mon=1;
						year+=1;
					}else{
						mon= mon +1;
					}
				day = 1;
			}else
				day+=1;
			}
		}
		break;
	case 03:
		if(day>31 || day<0){
			System.out.println("输入的日期不合法");
			System.exit(0);
		}else{
			if(day==31){
				if(mon==12){
					mon=1;
					year+=1;
				}else{
					mon= mon +1;
				}
			day = 1;
		}else
			day+=1;
       }
		break;
	case 04:
		if(day>30 || day<0){
			System.out.println("输入的日期不合法");
			System.exit(0);
		}else{
			if(day==30){
				if(mon==12){
					mon=1;
					year+=1;
				}else{
					mon= mon +1;
				}
			day = 1;
		}else
			day+=1;
       }
		break;
	case 05:
		if(day>31 || day<0){
			System.out.println("输入的日期不合法");
			System.exit(0);
		}else{
			if(day==31){
				if(mon==12){
					mon=1;
					year+=1;
				}else{
					mon= mon +1;
				}
			day = 1;
		}else
			day+=1;
       }
		break;
	case 06:
		if(day>30 || day<0){
			System.out.println("输入的日期不合法");
			System.exit(0);
		}else{
			if(day==30){
				if(mon==12){
					mon=1;
					year+=1;
				}else{
					mon= mon +1;
				}
			day = 1;
		}else
			day+=1;
       }
		break;
	case 07:
		if(day>31 || day<0){
			System.out.println("输入的日期不合法");
			System.exit(0);
		}else{
			if(day==31){
				if(mon==12){
					mon=1;
					year+=1;
				}else{
					mon= mon +1;
				}
			day = 1;
		}else
			day+=1;
       }
		break;
	case 8:
		if(day>31 || day<0){
			System.out.println("输入的日期不合法");
			System.exit(0);
		}else{
			if(day==31){
				if(mon==12){
					mon=1;
					year+=1;
				}else{
					mon= mon +1;
				}
			day = 1;
		}else
			day+=1;
       }
		break;
	case 9:
		if(day>30 || day<0){
			System.out.println("输入的日期不合法");
			System.exit(0);
		}else{
			if(day==30){
				if(mon==12){
					mon=1;
					year+=1;
				}else{
					mon= mon +1;
				}
			day = 1;
		}else
			day+=1;
       }
		break;
	case 10:
		if(day>31 || day<0){
			System.out.println("输入的日期不合法");
			System.exit(0);
		}else{
			if(day==31){
				if(mon==12){
					mon=1;
					year+=1;
				}else{
					mon= mon +1;
				}
			day = 1;
		}else
			day+=1;
       }
		break;
	case 11:
		if(day>30 || day<0){
			System.out.println("输入的日期不合法");
			System.exit(0);
		}else{
			if(day==30){
				if(mon==12){
					mon=1;
					year+=1;
				}else{
					mon= mon +1;
				}
			day = 1;
		}else
			day+=1;
       }
		break;

	default:
		if(day>31 || day<0){
			System.out.println("输入的日期不合法");
			System.exit(0);
		}else{
			if(day==31){
				if(mon==12){
					mon=1;
					year+=1;
				}else{
					mon= mon +1;
				}
			day = 1;
		}else
			day+=1;
       }
		break;
	}
       System.out.println("下一天为："+year+"-"+mon+"-"+day);
    }
}
