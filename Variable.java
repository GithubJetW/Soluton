class Variable {
	public static void main(String[] args) {
		// Coming soon: variables
		int tops;
		float gradePointAverage;
		char key = 'C';
		String productName = "Larvets";
		boolean gameOver = false;
		int allTimeHighScore;
		float pi = 3.14F; // 3.14F中的‘F’表示这是一个float浮点数值，若为‘L’表示是一个长精度整数，‘D’则表示双精度浮点整数；
		// Java 的另外一种命名约定是，值不变的变量名全部大写。这些变量成为常量；
		// 以下为常量
		final int TOUCHDOWN = 0;
		final int FIELDGOAL = 3;
		final int PAT = 1;
		// 使用常量的优点之一是程序更容易理解，常量名不是必须大写，只是编程人员约定俗成的区分变量和常量的表达方式；
		
		//++ --运算符可以放在变量前（变量前置），也可以放在变量后（变量后置）；
		//下面是关于变量前置和变量后置的区别
		int x = 3;
		int answer = x++ * 10; // answer值为30因为后置运算符是只有当整个百年大师执行完毕之后变量的值才会发生变化
		// 以上表达式实际执行过程是
		// int answer = x * 10
		// x++;
		//
		//同理，前置运算符则顺序相反
		int y = 2;
		int ed = ++y * 10; // ed的值应为30
//		System.out.println(answer + " and " + ed);
		
		
		// 运算符优先级
	    // 1. 先执行递增，递减操作
		// 2. 然后执行乘，除以及取模运算
		// 3. 然后执行价，减操作
		// 4. 然后是“比较”操作
		// 5. 最后使用等号（=）来设置变量
		
		
		
	}
}