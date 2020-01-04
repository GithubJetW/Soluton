class SpaceRemover {
//	关于数组的一些事情
//	创建数组和创建变量差别在于在变量类型名后面加上中括号"[]",或者在变量名后面加上中括号"[]"
//	一维数组加一个中括号"[]",多维数组则加多个中括号"[]"
//	若要在创建数组时就赋值可以1、把值放进大括号"{}"中， 
//	2、用 new 加上类型名和对应元素多少在中括号中，初始值都是空，
//	数字型的数组初始值为0，字符型数组为'\0',布尔型数组为false，其余的则为null。
	
	public static void main(String[] args) {
		String mostFamous = "Rudolph the Red.Nosed Reindeer";
		char[] mfl = mostFamous.toCharArray();
		for (int dex = 0;dex < mfl.length; dex++) {
			char current = mfl[dex];
			if (current != ' ') {
				System.out.print(current);
			}else {
				System.out.print('.');
				
			}
		}
//		System.out.println(mfl.length);
		
		int[] x;
		int[] y = new int[12];
		y[2] = 12;
		x = new int[2];
		int[] z = {1, 4, 7, 9};
//		System.out.print(x);
		System.out.print("\n" + z);
		System.out.print("\n" + y);
		
	}
}