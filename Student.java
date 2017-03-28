package curve;

public class Student {

	/**
	 * @param args
	 */
	private String name;
	private String section;
	private int raw;
	private int curve;
	private boolean rawPassing;
	private boolean curvePassing;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Student(String name, String section, int raw) {
		this.name = name;
		this.section = section;
		this.raw = raw;
		this.setRawPassing();
		this.curve = raw;
		this.curvePassing = this.rawPassing;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSection() {
		return this.section;
	}
	
	public int getRaw() {
		return this.raw;
	}
	
	public int getCurve() {
		return this.curve;
	}
	
	public boolean getRawPassing() {
		return this.rawPassing;
	}
	
	public boolean getCurvePassing() {
		return this.curvePassing;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSection(String section) {
		this.section = section;
	}
	
	public void setRaw(int raw) {
		this.raw = raw;
		this.setRawPassing();
	}
	
	public void setCurve(int curve) {
		this.curve = curve;
		this.setCurvePassing();
	}
	
	public void setCurve(int scale, int boost) {
		this.curve = scale * this.raw;
		this.curve /= 100;
		this.curve += boost;
		this.setCurvePassing();
	}
	
	private void setCurvePassing() {
		if (this.curve >= 60) {
			this.curvePassing = true;
		} else {
			this.curvePassing = false;
		}
	}
	
	private void setRawPassing() {
		if (this.raw >= 60) {
			this.rawPassing = true;
		} else {
			this.rawPassing = false;
		}
	}

}
