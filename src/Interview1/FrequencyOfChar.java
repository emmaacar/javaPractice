package Interview1;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String[] sentence = {"Aleksandar", "PerA", "Mailan", "Stevo", "Nina", "Niko", "nevpeNap"};
        String result = "";
        int length = 0;

        for (int i = 0; i < sentence.length; i++) {   //first loop to go through the array and get individual string
            for (int j = 0; j < sentence[i].length(); j++) {    // second loop to get char from every string that I will compare
                char ch = sentence[i].toLowerCase().charAt(j); // char that I will compare
                int count = 0;  // counter to see how many time char is appearing
                length = result.length(); // to know if string result changed so I know should I add results of count to the string
                for (int k = 0; k < sentence.length; k++) {  // this loop is for going through string again and getting new string
                    for (int l = 0; l < sentence[k].length(); l++) { // from the new string I am getting a new char value that I will compare to the old one
                        char compare = sentence[k].toLowerCase().charAt(l); // new char value
                        if (compare == ch && !result.contains("" + compare)) {  // if old and new char value are same I will add them to the string, If I already did that contains method will make sure I dont do it again
                            result += compare;
                        }
                        if (compare == ch ) {   // if old and new char is the same I will increase the count
                            count++;
                        }
                    }
                }
                //          System.out.println("l = " + length);             this is how I debugged app and figure out where should I put next if statement
                //          System.out.println("rl = " + result.length());   this is how I debugged app and figure out where should I put next if statement
                if (length < result.length()) {  // if length of the old result is smaller that mean that I added new char to the string and I will need to add count value to it so I know how many times it appears.
                    result += count;
                }
            }
        }
        System.out.println(result); //final result
    }
}
/*
finding freq of char in the array
 */


