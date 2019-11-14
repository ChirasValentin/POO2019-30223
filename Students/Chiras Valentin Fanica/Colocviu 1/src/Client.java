
public class Client extends Persoana {
	private int nrCamera;
	private String check_in;
	private String check_out;

	Client() {
		this.nrCamera = 0;
		this.check_in = null;
		this.check_out = null;
	}

	Client(int nrCamera, String dataCheck_in, String dataCheck_out) {
		this.nrCamera = nrCamera;
		this.check_in = dataCheck_in;
		this.check_out = dataCheck_out;
	}

	public void setNrCamera(int nrCamera) {
		this.nrCamera = nrCamera;
	}

	public void setDataCheck_in(String data) {
		this.check_in = data;
	}

	public void setDataCheck_out(String data) {
		this.check_out = data;
	}

	public int getNrCamera() {
		return this.nrCamera;
	}

	public String getDataCheck_in() {
		return this.check_in;
	}

	public String getDataCheck_out() {
		return this.check_out;
	}

	public String toString() {
		return this.getNume()  + " " + super.getID() + " -> Camera: " + this.nrCamera +" check_in: " + this.check_in + " check_out: " + this.check_out;
	}

}
