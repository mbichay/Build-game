import javax.swing.JButton;

@SuppressWarnings("serial")
public class TimerButton extends JButton{

	private static final String START = "START";
	private static final String STOP = "STOP";

	Boolean timerActive;

	public TimerButton(){
		this.timerActive = false;
		this.setText(START);
	}

	public void toggleLabel(){
		if (timerActive){
			this.setText(START);
			timerActive = false;
			return;
		}
		this.setText(STOP);
		timerActive = true;
	}

}