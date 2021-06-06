package sef.FinalActivity;

public class FirstActivity  {

public static void main(String[] arg){


    String employees[] = {"John", "Linda", "Mike", "Jim"};
    Double[] salary = new Double[]{780.0, 548.0, 852.0, 990.0};
    double temp;
    for(int i = 0; i<salary.length; i++){
        for(int j = i; j<salary.length; j++){
            if(salary[i] < salary[j]){
                temp = salary[i];
                salary[i] = salary[j];
                salary[j] = temp;
            }
        }
    }
    for(double a : salary){
        System.out.println(a);
    }
}
}
