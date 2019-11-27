package calendar.munca;

public class ExceptionBool extends Exception {
	private boolean exbool;
	public ExceptionBool(boolean exbool) {
		this.exbool = exbool;
	}
	public ExceptionBool()
	{}
	public boolean getExvool() {
		return exbool;
	}

}
