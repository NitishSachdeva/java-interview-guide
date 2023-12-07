package InterviewQuestionBank.javaprog;

public class TestPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*
//		*  *
//		*  *   *
//		*  *   *    *
	//	Program for Printing Pyramid Pattern in Java

		
		for(int i=1 ; i<5;i++)//outer loop prints 4 rows
		{
			// take care the logic of printing right format
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
