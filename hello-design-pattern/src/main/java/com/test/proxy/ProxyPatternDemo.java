package com.test.proxy;

public class ProxyPatternDemo {
    //属于组合模式，感觉这个DEMO有点不形象，想要表达，new一个RealImage的开销比较大，但是在这个image在当前这个main函数下，
    //我可以多次display都没提，并不存在开销大，可以考虑用户在不知道情这个图片的实现细节的前提下，多次new就导致开销大。
    //或者加一个机制，做一个static的缓存，如果有ProxyImage的实力初始化一个RealImage，那么他就直接找到这个照片的对象。


    //1.Windows 里面的快捷方式
    //2.一张支票或银行存单是账户中资金的代理。支票在市场交易中用来代替现金，并提供对签发人账号上资金的控制
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图片不需要从磁盘加载
        image.display();
    }
}
