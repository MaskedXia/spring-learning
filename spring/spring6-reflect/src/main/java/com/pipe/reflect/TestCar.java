package com.pipe.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestCar {

    @Test
    public void test() throws Exception {
        //1 类名.class
        Class<Car> clazz = Car.class;

        //2 对象.getClass
        Class<? extends Car> clazz2 = new Car().getClass();

        //3 Class.forName("全路径")
        Class<?> clazz3 = Class.forName("com.pipe.reflect.Car");

        // 实例化
        Car car = (Car)clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }

    @Test
    public void test2() throws Exception {
        // 构造函数
        Class<Car> clazz = Car.class;
        Constructor<?>[] constructors = clazz.getConstructors(); //只获取public构造
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + " " + constructor.getParameterCount());
        }
        //public
//        Constructor<Car> c1 = clazz.getConstructor(String.class, String.class, int.class);
//        Car car = c1.newInstance("BMW", "Blue", 10);
//        System.out.println(car);

        //private
        Constructor<Car> c2 = clazz.getDeclaredConstructor(String.class, String.class, int.class);
        c2.setAccessible(true);
        Car car2 = c2.newInstance("BMW", "Blue", 10);
        System.out.println(car2);
    }

    @Test
    public void test3() throws Exception {
        // 属性
        Class<Car> clazz = Car.class;
        Car car = clazz.getDeclaredConstructor().newInstance();
        //public
        Field[] fields = clazz.getFields();
        //private
        Field[] fields1 = clazz.getDeclaredFields();
        for (Field f : fields1) {
            if (f.getName().equals("name")){
                f.setAccessible(true);  // private属性赋值
                f.set(car, "BenZ");
            }
            System.out.println(f.getName() + " " + f.getType().getName());
        }
        System.out.println(car);
    }

    @Test
    public void test4() throws Exception {
        // 获取方法
        Class<?> clazz3 = Class.forName("com.pipe.reflect.Car");
        Car car = (Car)clazz3.getDeclaredConstructor().newInstance();

        Method[] methods = clazz3.getDeclaredMethods();
        for (Method m : methods) {
            if (m.getName().equals("run")) {
                m.setAccessible(true);
                int ans = (int) m.invoke(car);
                System.out.println(ans + " ******");
            }
            //System.out.println(m.getName() + " " + m.getParameterTypes().length);
        }
    }
}

