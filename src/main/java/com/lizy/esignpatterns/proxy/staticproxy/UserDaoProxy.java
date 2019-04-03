package com.lizy.esignpatterns.proxy.staticproxy;

/**
 *  代理对象,静态代理
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    UserDaoProxy(IUserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始事物。。。");
        target.save();
        System.out.println("事物结束。。。");
    }
}
