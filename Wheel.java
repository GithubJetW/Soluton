class Wheel {
    public static void main(String[] args) {
        String phrase[] = {
            "A STITCH IN TIME SAVES NINE",
            "DON'T EAT YELLOW SNOW",
            "JUST DO IT",
            "EVERY GOOD BOY DOES FINE",
            "I WANT MY MTV",
            "I LIKE IKE",
            "PLAY IT AGAIN, SAM",
            "FROSTY THE SNOWMAN",
            "ONE MORE FOR THE ROAD",
            "HOME FIELD ADVANTAGE",
            "VALENTINE'S DAY MASSAGE",
            "GROVER CLEVELAND OHIO",
            "SPAGHETTI WESTERN",
            "AQUA TEEN HUNGER FORCE",
            "IT'S A WONDERFUL LIFE"
        };
        int[] letterCount = new int[26];
        for (int count = 0; count < phrase.length; count++) {
            String current = phrase[count];
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++) {
                char lett = letters[count2];
                if ( (lett >= 'A') & (lett <= 'Z') ) {
                    letterCount[lett - 'A']++;
                }
            }
        }
        for (char count = 'A'; count <= 'Z'; count++){
            System.out.print(count + ": " + 
                    letterCount[count - 'A'] +
                    " ");
        }
        System.out.println();
//        for (int i = 0; i < letterCount.length; i++) {
//        	System.out.println(letterCount[i]);
//        }
//        'A'在加减法中值为65，对应的是ASCII码中的值；
//        System.out.println(69 - 'A');
    }
}
