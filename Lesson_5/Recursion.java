package AlgoritmyStructure;

public class Recursion {

    public static void main(String[] args) {
        String star = "*";
        String hallo = "Hello!";

        printstar(star); //Простая рекурсия
        CallStack(hallo); //Стек вызовов
        CallStackRecursion(hallo); //Стек вызовов с рекурсией


    }

    //TODO**************Recursion**********************************
    public static String printstar(String star) {
        System.out.print(star + "\n");
        if (star.length() == 10) {
            return "stop";
        }
        return printstar(star + "*");
    }

    //TODO****************CallStack******************************
    public static void CallStack(String hallo) {
        String name = " Jonne ";
        System.out.println(hallo + callSayGoodBye(name));
    }

    public static String callSayGoodBye(String name) {
        return name + " Bye!";
    }

    //TODO****************CallStackRecursion*******************
    private static void CallStackRecursion(String hallo) {
        String name = " Smith ";
        System.out.println(hallo + callNameRecursion(name));
    }

    private static String callNameRecursion(String name) {
        System.out.println(name + "\n");
        if (name.length() > 60) {
            return "stop";
        }
        return callNameRecursion(name + " in Anger! ");
    }
}