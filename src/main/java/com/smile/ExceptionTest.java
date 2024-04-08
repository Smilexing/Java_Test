package com.smile;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/8 9:09
 */
public class ExceptionTest {
        public static int aMethod(int i)throws Exception
        {
            try{
                return i/10;
            }
            catch (Exception ex)
            {
                throw new Exception("exception in a aMethod");
            }finally{
                System.out.printf("finally");
            }
        }
        public static void main(String[] args){
            try
            {
                aMethod(0);
            }
            catch (Exception ex)
            {
                System.out.printf("exception in main");
            }
            System.out.printf("finished");
        }
    }

