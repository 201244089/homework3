package homework3;
import java.util.*;
public class min_max {
	int num1,num2,num3;
	int max_num, min_num;
	
	public min_max(){}

	public void NumInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� ");
		num1 = input.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� ");
		num2 = input.nextInt();
		System.out.print("ù��° ���ڸ� �Է��ϼ��� ");
		num3 =input.nextInt();
	}
	public void NumOutput(){
		max_num = Math.max(Math.max(num1, num2), num3);
		min_num = Math.min(Math.min(num1, num2), num3);
		System.out.print("���� ū ���� "+max_num+"�̰�, ���� ��������"+min_num+"�Դϴ�.");
	}
	public static void main(String[] args) {
		min_max a = new min_max();
		a.NumInput();
		a.NumOutput();
	}

}
