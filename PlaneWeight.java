class PlaneWeight {
	public static void main(String[] args) {
		// System.out.print()显示完文本后不会换行，
		// System.out.println()显示完文本后会自动换行
		System.out.print("Your weight on Earth is ");
		double weight = 205;
		System.out.println(weight);
		
		System.out.print("Your weight on Mercury is ");
		double mercury = weight * .378;
		System.out.println(mercury);
		
		System.out.print("Your weight on the Moon is ");
		double moon = weight * .168;
		System.out.println(moon);
		
		System.out.print("Your weight on Jupiter is ");
		double jupiter = weight * 2.364;
		System.out.println(jupiter);
		
		System.out.print("Your weight on Venus is ");
		double venus = weight * .907;
		System.out.println(venus);
		
		System.out.print("Your weight on Uranus is ");
		double uranus = weight * .889;
		System.out.println(uranus);
	}
}