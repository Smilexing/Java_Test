package com.smile.Class;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/15 9:52
 */
public class ClassTest {

        private  static  String name="jesse";
        public static void main(String[] args) throws NoSuchFieldException,
                SecurityException, IllegalArgumentException, IllegalAccessException
        {


            ClassTest.class.getDeclaredField("name").getName();     //获取了私有静态字段 name

            String   fieldValue= ClassTest.class.getDeclaredField("name").get(null).toString();
            //获取名为 "name" 的字段在 ClassTest 类中的值，并将其作为字符串进行打印

            //    System.out.println(fieldName);
            //   
            System.out.println(fieldValue);
            /**
             getField只能查找公有属性
             */
                String   fieldName=ClassTest.class.getField("name").getName();  //这里name字段是private，它将抛出NoSuchFieldException
            //    String  
//            fieldValue= ClassTest.class.getField("name").get(null).toString();
            //   
            System.out.println(fieldName);
            //   
//            System.out.println(fieldValue);

            ClassTest ClassTest=new ClassTest();


            System.out.println( ClassTest. getClass(). getField
                    ("name"). get (ClassTest));

        }
    }


