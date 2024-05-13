package com.smile.WriteTest.Class;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/9 10:27
 */
//静态成员内部类，成员内部类
//成员内部类在类内部使用可以直接打类名，在类外部声明的类型需要外部类.内部类的形式
// 先实例化外部类再实例化内部类

class AA{   //在类外部声明--》需要将路径写完整
    public class Point{ public int x=1 , y=2 ; }
    public static class X11{};  //静态成员内部类
    public Point getPoint(){ return new Point() ; }

    public void printPoint(){
        Point point = new Point();
        System.out.println("point.x="+point.x+";point.y="+point.y);
    }

}
public class InnerClass2 {

        public static void main(String[] args) {

            AA aa = new AA();
            aa.printPoint();

            //静态内部类实例化
            com.smile.WriteTest.Class.AA.X11 x11 = new AA.X11();

            //内部类实例化的声明类型可以打全路径名或者外部类.内部类的形式
            com.smile.WriteTest.Class.AA.Point point = aa.new Point();
            System.out.println("point.x="+point.x+";point.y="+point.y);

            AA.Point point2 = aa.new Point();
            System.out.println("point.x="+point2.x+";point.y="+point2.y);

            com.smile.WriteTest.Class.AA.Point point1 = aa.getPoint();
            System.out.println("point.x="+point1.x+";point.y="+point1.y);

            AA.Point point3 = aa.getPoint();
            System.out.println("point.x="+point3.x+";point.y="+point3.y);

        }
    }


