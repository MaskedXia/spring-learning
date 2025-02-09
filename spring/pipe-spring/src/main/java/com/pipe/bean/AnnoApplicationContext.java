package com.pipe.bean;

import com.pipe.anno.Bean;
import com.pipe.anno.Di;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnnoApplicationContext implements ApplicationContext{

    // 创建map集合，存放bean对象

    private Map<Class, Object> beanFactoryMap = new HashMap<>();
    private static String rootPath;

    // 返回对象
    @Override
    public Object getBean(Class clazz) {
        return beanFactoryMap.get(clazz);
    }

    //包的扫描规则
    public AnnoApplicationContext(String basePackage) {
        // com.pipe
        try {
            String packagePath = basePackage.replaceAll("\\.", "\\\\");
            Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while(urls.hasMoreElements()) {
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());
                //System.out.println(filePath);
                loadBean(new File(filePath));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //属性注入
        loadDi();
    }

    private void loadDi() {
        Set<Map.Entry<Class, Object>> entries = beanFactoryMap.entrySet();
        for (Map.Entry<Class, Object> entry : entries) {
            Object value = entry.getValue();
            Class<?> clazz = value.getClass();
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field : declaredFields) {
                Di annotation = field.getAnnotation(Di.class);
                if (annotation!= null) {
                    field.setAccessible(true);
                    try {
                        field.set(value, beanFactoryMap.get(field.getType()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void loadBean(File file) throws Exception {

        if (file.isDirectory()) {
            File[] childfiles = file.listFiles();
            if (childfiles == null || childfiles.length == 0) {
                return;
            }

            for (File child : childfiles) {
                if (child.isDirectory()) {
                    loadBean(child);
                }else{
                    String pathWithClass = child.getAbsolutePath().substring(rootPath.length() - 1);
                    if (pathWithClass.contains(".class")) {
                        String allName = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
                        Class clazz = Class.forName(allName);
                        if (!clazz.isInterface()){
                            Bean annotation = (Bean) clazz.getAnnotation(Bean.class);
                            if (annotation != null){
                                Object instance = clazz.getConstructor().newInstance();
                                if (clazz.getInterfaces().length > 0){
                                    beanFactoryMap.put(clazz.getInterfaces()[0], instance);
                                }else{
                                    beanFactoryMap.put(clazz, instance);
                                }

                            }
                        }
                    }
                }
            }
        }
    }


}
