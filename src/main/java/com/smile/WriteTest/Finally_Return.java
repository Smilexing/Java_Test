package com.smile.WriteTest;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/4 12:15
 */
public class Finally_Return {
        public int add(int a,int b){
            try {
                return a+b;
            }
            catch (Exception e) {
                System.out.println("catch语句块");
            }
            finally{
                System.out.println("finally语句块");
            }
            return 0;
        }
        public static void main(String argv[]){
            Finally_Return test =new Finally_Return();
            System.out.println("和是："+test.add(9, 34));
        }
    }

