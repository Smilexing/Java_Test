package com.smile.tasktimer.JDK;



/**
 * 实现二：使用子类重写父类方法统计耗时
 * 对比直接在父类中添加代码，好处是这样修改只在子类，不会影响到源代码
 * 但如果有很多业务类则对应都要写一个子类来重写，继承关系（extends），耦合度较高
 */
public class OrderServiceImplSub extends OrderServiceImpl{
    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        super.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        super.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        super.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
    }
}