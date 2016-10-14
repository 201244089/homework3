package homework3;
import java.util.*;

public class Apart_Decide {
	double m2_area;
	double pyung_area;
	Scanner input = new Scanner(System.in);
	
	public Apart_Decide(){}
	
	public void M2Input(){
		System.out.print("아파트의 분양 면적(제곱미터)를 입력하시오");
		m2_area = input.nextDouble();
	}
	public void Pyung(){
		pyung_area = m2_area / 3.305;
		System.out.printf("아파트의 평형은 %.1f 입니다. \n", pyung_area );
	}
	public void Decide(){
		if(pyung_area < 15){System.out.print("소형 아파트 입니다.");}
		if(pyung_area>=15 && pyung_area < 30){System.out.print(" 중소형 아파트 입니다.");}
		if(pyung_area>=30 && pyung_area < 50){System.out.print(" 중형 아파트 입니다.");}
		if(pyung_area > 50){System.out.print("대형 아파트 입니다.");}
	}

	public static void main(String[] args) {
		Apart_Decide a = new Apart_Decide();
		a.M2Input();
		a.Pyung();
		a.Decide();

	}

}
