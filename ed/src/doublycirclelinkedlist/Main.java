package doublycirclelinkedlist;

public class Main {



    public static void main(String[] args){
        CircleLinkedList<Integer> nums = new CircleLinkedList<>();

        nums.append(15);
        nums.append(40);
        nums.append(12);
        nums.append(515);

        System.out.println(nums);
    }

}
