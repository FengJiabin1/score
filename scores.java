import java.util.Scanner;

public class scores{
	public static void main(String[] args){
		int clasNum=3;
		int stuNum=4;
		Scanner input=new Scanner(System.in);
		double avg=0;
		for(int i=1;i<=clasNum;i++){
			double sum=0;
			System.out.println("***�������"+i+"���༶�ĳɼ�***");
			for(int j=1;j<=stuNum;j++){
				System.out.println("�������"+j+"��ѧԱ�ĳɼ���");
				int scores=input.nextInt();
				sum=sum+scores;
			}
		avg=sum/stuNum;
		System.out.println("��"+i+"���༶��ƽ���ɼ�Ϊ��"+avg);
		}	
	}
}