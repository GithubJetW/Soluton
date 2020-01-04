import java.util.Random;

class Practice{
	public static void main(String[] arguments) {
		
//		创建一个程序，它在一个名为grade的变量中存储用户从1~100之间选择的值在条件语句中
//		使用grade变量向A、B、 C、 D和E类学生显示不同的信息。先用if语句完成这项工作，
//		然后用switch语句完成 
//		System.out.print(Math.random()); 
//		long grade = Math.round( Math.random() * 100 );
//		System.out.println(grade);
//		char level;
//		if (grade >= 90) {
//			level = 'A';
//		}else if (grade >= 80 & grade < 90) {
//			level = 'B';
//		}else if (grade >= 70 & grade < 80) {
//			level = 'C';
//		}else if (grade >= 60 & grade < 70) {
//			level = 'D';
//		}else level = 'E';
//		System.out.println(level);
		
//		switch (level) {
////		switch case语句切记需要在每个case句块结束后加上break退出switch，否则会执行匹配case后面所有的case句块，知道遇到break才结束switch。
//			case 'A':
//				System.out.println("你是最棒的！");
//				break;
//			case 'B':
//				System.out.println("哎哟，不错哦");
//				break;
//			case 'C':
//				System.out.println("嗯，还不错嘛");
//				break;
//			case 'D':
//				System.out.println("加油，你会更好的");
//				break;
//			case 'E':
//				System.out.println("你需要努力了，加油");
//				break;
////			default 是在以上case都没匹配上时会执行的语句
//			default:
//				System.out.println("this is default ");
//		}
//		String leve;
//		if (grade >= 90) {
//			leve = "A";
//		}else if (grade > 80) {
//			leve = "B";
//		}else if (grade > 70) {
//			leve = "C";
//		}else if (grade > 60) {
//			String leve = "D";
//		}else {
//			String leve = "E";
//		}
		
//		char leve1 = leve;
//		switch (leve) {
//			case 'A':
//				System.out.print("你是真的太棒了啊!");
//				
//		}
		
		
//		第8章练习 使用循环写一个小程序，找出前400个能被13整除的数
//		int i = 1;
//		int count = 0;
//		for (;true;i++) {
//			if (i % 13 == 0) {
//				count++;
//				System.out.print(i + "\t");
//				if (count % 20 == 0) System.out.print("\n");
//			}
//			if (count == 200) break;
//		}
		
		
		
//		9.9 练习
//		1、 创建一个程序，它使用多维数组存储学生的成绩。第一维是学生编号，第二维是每个学生的成绩。显示全部学生的平均成绩。
//		2、 编写一个程序，将能被13整除的前400个数存储到数组中。
//		int[][] studentGrade = new int[5][1];
////		studentGrade = {{44}, {88}, {99}, {89}, {39}};
////		studentGrade = {[44], [23], [23], [45], [23]};
//		int grade[] = {25, 77, 99, 64, 89};
//		String[] student = {"张山", "李四", "王五", "秦始皇", "李克强"};
//		for (int i = 0; i < grade.length; i++) {
//			studentGrade[i][0] = grade[i];
//		}
//		int j = 0;
//		do {
//			System.out.println(
//					"学生编号为：" + (j+1) + "的学生 "+ student[j] +" 的考试成绩为： " + studentGrade[j][0]
//					);
//			j++;
//		}while (j < studentGrade.length);
		
		int i = 0;
		int j = 1;
		int[] number = new int[400];
		while (i < 400) {
			if (j % 13 == 0) {
				number[i] = j;
				i++;
				}
			j++;
			}
//		for (int k = 0; k < number.length; k++) System.out.print(number[k] + " ");
		for (int k = 0; k < number.length; k++) {
			System.out.print(number[k] + " ");
			if (k % 15 == 0) {
				System.out.print("\n");
			}
		}
		
		
		
		
		
		
		
	}
}