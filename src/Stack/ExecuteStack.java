package Stack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ExecuteStack
    {
        
        public static void main(String[] args)
            {
                ArrayListStack<Integer> stack = new ArrayListStack<Integer>();
                Scanner sc = new Scanner(System.in);
                Random random = new Random();
                int stackSize;
                int temp;
                
                int looper = random.nextInt(10);
                System.out.println("Looper is" + looper);
                int seekValue = random.nextInt(100);
                System.out.println("To Seek " + seekValue);
                
                for (int i = 0; i < looper; i++)
                    {
                        stack.push(sc.nextInt());
                    }
                stackSize = stack.size();
                temp = stackSize;
                System.out.println("Stack initalized");
                
                if (stack.contains(seekValue))
                    {
                        System.out.println("Matched");
                        System.out.println(stack.access(seekValue));
                        stackSize = stack.size();
                    }
                else
                    System.out.println("Not There");
                    System.out.println("Size " + stackSize);
                    System.out.println("Diff "+(stackSize - temp));
                
                for (int i = 0; i < stackSize; i++)
                    {
                        System.out.println(stack.pop());
                    }
            }
    }
