package Advance.dev;

public class Student extends Person {
	// Thuộc tính
	private double toan;
	private double ly;
	private double hoa;

	// Phương thức khởi tạo
	public Student(String name, int age, double toan, double ly, double hoa) {
		super(name, age);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	// Phương thức getter và setter cho thuộc tính toan
	public double getToan() {
		return toan;
	}

	public void setToan(double toan) {
		this.toan = toan;
	}

	// Phương thức getter và setter cho thuộc tính ly
	public double getLy() {
		return ly;
	}

	public void setLy(double ly) {
		this.ly = ly;
	}

	// Phương thức getter và setter cho thuộc tính hoa
	public double getHoa() {
		return hoa;
	}

	public void setHoa(double hoa) {
		this.hoa = hoa;
	}

	// Phương thức tính điểm trung bình
	public double diemTrungBinh() {
		return (toan + ly + hoa) / 3;
	}
}
