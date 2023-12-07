package InterviewQuestionBank.javaprog;

public class ChildEmirites extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildEmirites c= new ChildEmirites();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
		
		//ParentAirCraft p = new ParentAirCraft();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
