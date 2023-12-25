package org.springframework.zpr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * TODO
 *
 * @author WangYu
 * @date 2023/11/29 15:41
 */
public class AppTest {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        String en_us = context.getMessage("weather.is.nice", null, new Locale("en_us"));
//        System.out.println(en_us);
//        Resource[] resources = context.getResources("classpath:com/wy/spring/bean/*.class");
//        for (Resource resource : resources) {
//            System.out.println(resource.getFilename());
//        }
//        Map<String, Object> systemEnvironment = context.getEnvironment().getSystemEnvironment();
//        System.out.println(systemEnvironment);
//
//        MutablePropertySources propertySources = context.getEnvironment().getPropertySources();
//        System.out.println(propertySources.get("profile"));
//
//        String profile = context.getEnvironment().getProperty("profile");
//        System.out.println(profile);

//        StringToUserPropertyEditor propertyEditor = new StringToUserPropertyEditor();
//        propertyEditor.setAsText("1");
//        User value = (User) propertyEditor.getValue();
//        System.out.println(value);
//        A a = new A();
//        B b = new B();
//        OrderComparator comparator = new OrderComparator();
//        int compare = comparator.compare(a, b);
//        List<Object> list = new ArrayList<>();
//        list.add(a);
//        list.add(b);
//        list.sort(comparator);

//        Object userService = context.getBean("userService");
//        System.out.println(userService);
//        SimpleMetadataReaderFactory simpleMetadataReaderFactory = new SimpleMetadataReaderFactory();
//        MetadataReader metadataReader = simpleMetadataReaderFactory.getMetadataReader("com.wy.spring.bean.UserService");
//        ClassMetadata classMetadata = metadataReader.getClassMetadata();
//        System.out.println(classMetadata.getClassName());
//
//        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
//        for (String annotationType : annotationMetadata.getAnnotationTypes()) {
//            System.out.println(annotationType);
//        }

    }
}
