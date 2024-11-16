import java.util.*;
public class arrayList
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size : "+number.size());
        number.add(10);
        number.add(40);
        number.add(20);
        number.add(70);
        number.add(30);
        System.out.println("Number : "+number);
        System.out.println("Size : "+number.size());

        boolean status = number.isEmpty();
        System.out.println("Is it Empty? "+status);

        // number.clear(); //to clear
        // status = number.isEmpty();
        // System.out.println("Is it Empty? "+status);
        
        boolean contain = number.contains(20); //to know if the number is available  or not?
        System.out.println("Is 20 available? "+contain);

        int index = number.indexOf(30); // to see the any value's position from arraylist
        System.out.println("Index of 20 is : "+index);

        number.set(2, 50); //to replace & 1st will be the available index value && 2nd will be the desire number
        System.out.println("Number : "+number);

        int get = number.get(2); //to see the desire's index value 
        System.out.println("Number in index position 2 : "+get);

        ArrayList<Integer> number1 = new ArrayList<>();
        number1.addAll(number); // to copy all value from num1 at a time 
        boolean equal = number.equals(number1); // to check if it is equal?
        System.out.println("Is Number equals to Number1?  : "+equal);

        System.out.println("Before sorted : "+number);
        Collections.sort(number);
        System.out.println("Ascending sorted : "+number);

        System.out.println("Before sorted : "+number);
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Descending sorted : "+number);
    }
}