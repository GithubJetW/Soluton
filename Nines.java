class Nines {
	public static void main(String[] arguments) {
		// for 循环
		System.out.println("for 循环开始...");
		for (int dex = 1; dex <= 200; dex++) {
			int multiple = 9 * dex;
			System.out.print(multiple + "\t");
			if (dex % 20 == 0) System.out.print("\n");
		}
		System.out.println("for 循环结束。\n");
		
		// while循环
		System.out.println("while 循环开始...");
		int limit = 200;
		int count = 1;
		while (count <= limit) {
			System.out.print(count * 9 + "\t");
			if (count % 20 == 0) System.out.println("\n");
			count++;
			if (count == 20) break;
		}
		System.out.println("while 循环结束。\n");
		
		
		// do-while 循环
		
//		do {
//			// the statements inside the loop go here
//		} while {gameLives > 0}
		
		System.out.println("do-while 循环开始...");
		int limitDoWhile = 200;
		int countDoWhile = 1;
		do {
			System.out.println("I will not Xerox my butt");
			countDoWhile++;
		} while (countDoWhile <= limitDoWhile);
		System.out.println("do-while 循环结束。\n");
		
// continue 会跳出当次循环进行下次循环
// break 会立即结束循环
		
		// java 版99乘法表 while 嵌套 for 循环
		int a = 1;
		int b = 1;
		while (a <= 9) {
			for (b = 1; b <= 9; b++) {
				if (a >= b) System.out.print(a * b + "\t");
			}
			System.out.print("\n");
			a++;
		}
		
		// do-while 嵌套 while 循环
		int x = 9;
		do {
			int y = 1;
			while (y <= 9) {
				if (x >= y) System.out.print(x * y + "\t");
				y++;
			}
			x--;
			System.out.print("\n");
		} while(x >= 1);
	}
}