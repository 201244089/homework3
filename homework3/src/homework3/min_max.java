package homework3;
import java.util.*;
public class min_max {
	int num1,num2,num3;
	int max_num, min_num;
	
	public min_max(){}

	public void NumInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 ");
		num1 = input.nextInt();
		System.out.print("두번째 숫자를 입력하세요 ");
		num2 = input.nextInt();
		System.out.print("첫번째 숫자를 입력하세요 ");
		num3 =input.nextInt();
	}
	public void NumOutput(){
		max_num = Math.max(Math.max(num1, num2), num3);
		min_num = Math.min(Math.min(num1, num2), num3);
		System.out.print("가장 큰 수는 "+max_num+"이고, 가장 작은수는"+min_num+"입니다.");
	}
	public static void main(String[] args) {
		min_max a = new min_max();
		a.NumInput();
		a.NumOutput();
	}

}
