package Advance.dev;

public class Teacher extends Person {
	// Thuộc tính
	private double hsl;

	// Hằng số
	private static final double LUONG_CO_BAN = 1800000;

	// Phương thức khởi tạo
	public Teacher(String name, int age, double hsl) {
		super(name, age);
		this.hsl = hsl;
	}

	// Phương thức getter và setter cho thuộc tính hsl
	public double getHsl() {
		return hsl;
	}

	public void setHsl(double hsl) {
		this.hsl = hsl;
	}

	// Phương thức tính lương
	public double tinhLuong() {
		return LUONG_CO_BAN * hsl;
	}
}
