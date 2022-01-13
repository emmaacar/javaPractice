package Interview1;

public class UniqueCharacter {

    public static void main(String[] args) {

        String str = "aabbcdddeyyfff";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char characters = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (characters == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {  // eger count 1 e esitse yunik oluyor
                result += characters + "";

                System.out.println("characters = " + characters);

                System.out.println(" = ==================" );

                }

            }
        }
    }


