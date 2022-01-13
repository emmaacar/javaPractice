package Interview1;

public class FindMaxMinAverage {

    public static void main(String[] args) {

        int[] numbers = {1, 45, 78, 90, 45, 31, 76, 89};

        int max = numbers[0];
        int min = numbers[0];
        int sum = numbers[0];

        for (int each : numbers) {   // numberdaki (araydaki) her elementi tek tek al (each) karsilastir. nestit if kullaniyorsun
            if (each > max) {
                max=each;
            }
                if (each< min){
                    min=each;
            }
                sum+=each;
        }
        double average =(double) sum/numbers.length;

        System.out.println("min = "+ min);
        System.out.println("max = "+ max);
        System.out.println(average);


        System.out.println(" = =============================");

        int[] numberss = {1, 4, 70, 10, 45, 31, 5, 22};
        
        int maxx  = numberss[0];
        int minn = numbers[0];
        int summ = numberss[0];

        for (int each : numberss) {
            if (each> maxx ){
                maxx = each;
                
            }
            if (each < minn){
                minn = each;
            }
            sum  += each;
        }

        int avarage = (int)sum /numbers.length;
        System.out.println("avarage = " + avarage);
    }

    }
    
    
    

   // eger degistimeye calistirmiyorsak sadece birseyi kiyasliyorsak each kullaniyoruz.Genelde arraylerde each kullaniyoruz
