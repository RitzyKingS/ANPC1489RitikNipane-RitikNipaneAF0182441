//Write a program to accept product name, ID, Price . Arrange the data in Descending order and display the output. (Using Linked List).
class student                                                           // another class that taking the variable
{
        private String name;                                            // private variable declaration
        private int regNumber;
        public student(String n, int reg)                               // to string method
        {
                this.name = n;
                this.regNumber = reg;
        }
        public String getName()                                         // getter setter method
        {
                return name;
        }
        public void setName(String name)
        {
                this.name = name;
        }
        public int getReg()
        {
                return regNumber;
        }
        public void setReg(int regNumber)
        {
                this.regNumber = regNumber;
        }
        public String toString()
        {
                return "Student Name: "+this.name+", Reg Number: "+this.regNumber;  
        }
}

import java.util.*;
class StudCompare implements Comparator<student>                        // this class implements the comparator of string
{
        @Override
        public int compare(student stud1, student stud2)                // compare method that override by comparator interface
        {
                if (stud1.getReg() < stud2.getReg())
                {
                        return 1;
                }
                return -1;
        }
}
class Sorted_List
{
        public static void main(String[] args)
        {
                LinkedList<student> list = new LinkedList<student>();
                list.add(new student("John", 1001));
                list.add(new student("Raju", 1005));
                list.add(new student("Sham", 1000));
                list.add(new student("Ravi", 1002));
                Collections.sort(list, new StudCompare());
                System.out.println("Sorted list based on registration number\n");
                System.out.println("**=============**=================**");
                for (student stud: list )
                {
                        System.out.println(stud);
                }
                System.out.println("**=============**=================**\n");
        }
}
