package calendar.munca;

public class ExceptionString extends Exception {
	private String msg;
	public ExceptionString(String msg)
	{
		super(msg);
	this.msg = msg;
	}
	public ExceptionString() {};
	public String getMSg()
	{
		return msg;
	}
	public void setMSg(String msg)
	{
		this.msg=msg;
	}
}
