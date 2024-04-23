package com.smile.WriteTest.override;


/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/17 17:06
 */
// 改写equal方法，判断指定内容是否相同
public class overrideEqual {
    private int age;
    private String name;

    public overrideEqual(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof overrideEqual) {
            overrideEqual p = (overrideEqual) o;
            return age == p.age && name.equals(p.name);
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "程序员大彬";
        overrideEqual p1 = new overrideEqual(18, name);
        overrideEqual p2 = new overrideEqual(18, name);
        Class clz = p1.getClass();  //返回此 Object 的运行时类
        System.out.println(clz);
        //获取类名
        System.out.println(clz.getName());

        System.out.println(p1.equals(p2));
    }
}
