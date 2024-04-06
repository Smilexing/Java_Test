package com.smile.threadlocal;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/5 19:21
 */
public class threadLocal {
    private ThreadLocal<String> name = new ThreadLocal<>();  //这里的name做ThreadLocalMap的key，也就是ThreadLocal对象
    

    public void setName(String name){ //这里的name做ThreadLocalMap的value
        this.name.set(name);
    }
    public String getName(){
        return this.name.get();
    }  //get是依旧ThreadLocalMap的key去取值


}
