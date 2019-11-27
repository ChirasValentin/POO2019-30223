package calendar.munca;

public class Lucrator {
	private String nume;
	CalendarLucru calendar;

	public Lucrator(String nume, CalendarLucru calendar) {
		this.nume = nume;
		this.calendar = calendar;
	}

	public Lucrator() {
	}

	public void lucreaza(String zi) throws ExceptieZiNelucratoare {

		Zi a[] = calendar.getZile();
		boolean ok = true;
		for (int i = 0; i < 7; i++) {
			if (a[i].getZi().equals(zi))
				if (a[i].getLucratoare() == true) {
					System.out.println(this.nume + "nu lucreaza" + zi);
					ok = false;
				} else {
					ok = false;
					throw new ExceptieZiNelucratoare("!!!" + zi + "nu lucreaza angajatul " + this.nume);

				}
		}
		if (ok == true)
			throw new ExceptieZiNelucratoare(zi + "nu este o zi a saptamanii");

	}

	public String getNume() {

		return nume;

	}

	public void setNume(String nume) {

		this.nume = nume;

	}

	public CalendarLucru getCalendar() {

		return calendar;

	}

	public void setCalendar(CalendarLucru calendar) {

		this.calendar = calendar;

	}
}
