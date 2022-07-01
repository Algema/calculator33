package pro.sky.java.course2.calculator33;

public class CalculatorService {


    public CalculatorService() {

    }
    public static String sum (Integer num1, Integer num2){
        if (num1==null&& num2!=null){
            System.out.println("подайте первый параметр");
            return "подайте первый параметр";
        }else if( num1!=null && num2==null){
            System.out.println("подайте второй параметр");
            return "подайте второй параметр";
        } else if (num1==null&& num2==num2) {
            System.out.println("Подайте оба параметра");
            return "Подайте оба параметра";
        }else{
        int sum=num1+num2;
        System.out.println(sum);
        return num1+"+"+num2+"="+sum;
        }

    }
    public static String minus(Integer num1, Integer num2){
        if (num1==null&& num2!=null){
            System.out.println("подайте первый параметр");
            return "подайте первый параметр";
        }else if( num1!=null && num2==null){
            System.out.println("подайте второй параметр");
            return "подайте второй параметр";
        } else if (num1==null&& num2==num2) {
            System.out.println("Подайте оба параметра");
            return "Подайте оба параметра";
        }else{
        int minus=num1-num2;
        System.out.println(minus);
        return num1+"-"+num2+"="+minus;
        }
    }
    public static String multiply( Integer num1,Integer num2) {
        if (num1 == null && num2 != null) {
            System.out.println("подайте первый параметр");
            return "подайте первый параметр";
        } else if (num1 != null && num2 == null) {
            System.out.println("подайте второй параметр");
            return "подайте второй параметр";
        } else if (num1 == null && num2 == num2) {
            System.out.println("Подайте оба параметра");
            return "Подайте оба параметра";
        } else {
            int multiply = num1 * num2;
            System.out.println(multiply);
            return num1 + "*" + num2 + "=" + multiply;
        }
    }

        public static String divide(Integer num1, Integer num2){
            if (num1 == null && num2 != null) {
                System.out.println("подайте первый параметр");
                return "подайте первый параметр";
            } else if (num1 != null && num2 == null) {
                System.out.println("подайте второй параметр");
                return "подайте второй параметр";
            } else if (num1 == null && num2 == num2) {
                System.out.println("Подайте оба параметра");
                return "Подайте оба параметра";
            } else if (num2 == 0) {
                System.out.println("На ноль делить нельзя");
                return "На ноль делить нельзя";
            } else {
                Integer divide = num1 / num2;
                System.out.println(divide);
                return num1 + "/" + num2 + "=" + divide;
            }


        }
    }





