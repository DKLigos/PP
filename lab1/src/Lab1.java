import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab1 {
    public static int vXc(int k){
        ArrayList<Integer> vector = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i,j=k;
        for (i=0; i<j; i++){
            vector.add(i);
        }
            System.out.println(vector);
        int number=2;
        for (i=0; i<j; i++){
            result.add( number * vector.get(i)); }
        System.out.println(result);
     return 0;
    }

    public static int vXv(int k){
        ArrayList<Integer> vector1 = new ArrayList<Integer>();
        ArrayList<Integer> vector2 = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i,j=k;
        for (i=0; i<j; i++){
            vector1.add(i);
            vector2.add(i+10);
        }
        for (i=0; i<j; i++){
            result.add( vector1.get(i) + vector2.get(i)); }
        System.out.println(result);
        return 0;
    }

    public static int mXc(int l, int number){
        List<List<Integer>> array = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<l; i++){
            array.add(new ArrayList<>());
            for (int j=0;j<l;j++){
                array.get(i).add(j);
            }
        }
        for (int i=0; i<l; i++) {
            result.add(new ArrayList<>());
            for (int j = 0; j < l; j++) {
                result.get(i).add(array.get(i).get(j) * number);

            }
            System.out.println(result.get(i));
        }
        return 0;
    }
    public static int mXv(int l, int number){
        List<List<Integer>> array = new ArrayList<>();
        ArrayList<Integer> vector = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<l; i++){
            vector.add(i);
        }
        for (int i=0; i<l; i++){
            array.add(new ArrayList<>());
            for (int j=0;j<l;j++){
                array.get(i).add(j);
            }
        }
        int sumstr=0;
        for (int i=0; i<l; i++) {
            result.add(new ArrayList<>());
            for (int j = 0; j < l; j++) {
                sumstr+=array.get(i).get(j) * vector.get(j);

            }
            result.get(i).add(sumstr);
            sumstr =0;
        }
        System.out.println(result);
        return 0;
    }

    public static int mXm(int l){
        List<List<Integer>> matrix1 = new ArrayList<>();
        List<List<Integer>> matrix2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<l; i++){
            matrix1.add(new ArrayList<>());
            for (int j=0;j<l;j++){
                matrix1.get(i).add(j);
            }
            System.out.println(matrix1.get(i));
        }
        System.out.println();
        for (int i=0; i<l; i++){
            matrix2.add(new ArrayList<>());
            for (int j=0;j<l;j++){
                matrix2.get(i).add(j);

            }
            System.out.println(matrix2.get(i));
        }
        System.out.println();

        int sumstr=0;
        for (int i=0; i<l; i++) {
            result.add(new ArrayList<>());
            for (int j = 0; j < l; j++) {
                for (int s = 0; s < l; s++) {
                    sumstr += matrix1.get(i).get(s) * matrix2.get(s).get(j);

                }
                result.get(i).add(sumstr);
                sumstr=0;
            }


        }
        System.out.println(result);
        return 0;
    }

    public static void main(String[] args) {
        Lab1 vec = new Lab1();
      //  Lab1.vXc(200);
       // Lab1.vXv(100);
        //Lab1.mXc(100,100);
      //  Lab1.mXv(10,10);
        Lab1.mXm(3);
    }
}
