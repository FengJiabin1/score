import java.util.Scanner;

public class scores{
	public static void main(String[] args){
		int clasNum=3;
		int stuNum=4;
		Scanner input=new Scanner(System.in);
		double avg=0;
		for(int i=1;i<=clasNum;i++){
			double sum=0;
			System.out.println("***请输入第"+i+"个班级的成绩***");
			for(int j=1;j<=stuNum;j++){
				System.out.println("请输入第"+j+"个学员的成绩：");
				int scores=input.nextInt();
				sum=sum+scores;
			}
		avg=sum/stuNum;
		System.out.println("第"+i+"个班级的平均成绩为："+avg);
		}	
	}
}