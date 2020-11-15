package com.demo.designPatterns.singleton;

/**
 * 该实现可以防止反射攻击。在其它实现中，通过 setAccessible方法可以将私有构造函数的访问级别设置为public，
 * 然后调用构造函数从而实例化对象，如果要防止这种攻击，需要在构造函数中添加防止多次实例化的代码。
 * 该实现是由 JVM 保证只会实例化一次，因此不会出现上述的反射攻击。
 * 该实现在多次序列化和序列化之后，不会得到多个实例。而其它实现需要使用 transient 修饰所有字段，并且实现序列化和反序列化的方法。
 */
public enum EnumImplement {

    INSTANCE;

    private String name;

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public static void main(String[] args) {
        EnumImplement enumImplement = EnumImplement.INSTANCE;
        enumImplement.setName("123");
        System.out.println(enumImplement.getName());
        EnumImplement enumImplement1 = EnumImplement.INSTANCE;
        enumImplement1.setName("456");
        System.out.println(enumImplement.getName());
        System.out.println(enumImplement1.getName());
        System.out.println(EnumImplement.class.getEnumConstants().length);
    }
}
