import java.sql.SQLOutput;

public class Canada {


        public boolean isCold;
        public int MedianHomePrice;
        public String PM;


        public Canada () {
            isCold = true;
            MedianHomePrice = 1000000;
            PM = "Mark Carney";
        }


            public void Printinfo (){
            System.out.println("Welcome to Canada Buddy");
            System.out.println(isCold ", It is cold");
            System.out.println(MedianHomePrice + "Canadian Dollars");
            System.out.println(PM "is the prime minister");
        }

}
