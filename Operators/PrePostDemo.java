package Operators;

// In the following program, explain why the value "6" is printed twice in a row

public class PrePostDemo {

  public static void main(String[] args){

    int i = 3;
    i++;
    System.out.println(i);    // "4"
    ++i;                     
    System.out.println(i);    // "5"
    System.out.println(++i);  // "6"
    System.out.println(i++);  // "6"
    System.out.println(i);    // "7"

  }
}

// ++i increments i, then calls the println function
// i++ calls the println functions first, then increments i; so the new value gets printed on the next line