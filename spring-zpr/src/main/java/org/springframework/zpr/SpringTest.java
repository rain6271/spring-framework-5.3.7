package org.springframework.zpr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;
import org.springframework.zpr.bean.UserService;

import java.io.File;
import java.io.IOException;

/**
 * TODO
 *
 * @author WangYu
 * @date 2023/11/29 15:41
 */
public class SpringTest {

    public static void main(String[] args) throws IOException {
//        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//        beanDefinition.setBeanClass(UserService.class);
//        context.registerBeanDefinition("userService", beanDefinition);
//        context.refresh();
//        UserService userService = (UserService)context.getBean("userService");
//        System.out.println(userService);


//        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(context);
//        xmlBeanDefinitionReader.loadBeanDefinitions("spring.xml");
//        context.refresh();
//        System.out.println(context.getBean("userService"));

//        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
//        scanner.scan("com.wy.spring.bean");
//        context.refresh();
//        System.out.println(context.getBean("userService"));

//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//        beanDefinition.setBeanClass(UserService.class);
//        beanFactory.registerBeanDefinition("userService", beanDefinition);
//        System.out.println(beanFactory.getBean("userService"));
//        context.refresh();
//        Object userService = context.getBean("userService");
//        System.out.println(userService);

//		Resource[] resources = context.getResources("file:D:\\spring-source\\spring-framework-5.3.7\\spring-zpr\\build\\classes\\java\\main\\org\\springframework\\zpr\\bean");
//		DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
//		for (Resource resource : resources) {
//			File file = resource.getFile();【
//			if (file.isDirectory()) {
//				File[] files = file.listFiles();
//				for (File file1 : files) {
//					Resource resource1 = resourceLoader.getResource("classpath:org/springframework/zpr/bean/A.class");
//					SimpleMetadataReaderFactory readerFactory = new SimpleMetadataReaderFactory();
//					Class<? extends ClassMetadata> aClass = readerFactory.getMetadataReader(resource1).getClassMetadata().getClass();
//					System.out.println(aClass);
//				}
//
//			}
//			System.out.println(file);
//		}

//		Resource[] resources = context.getResources("classpath:org/springframework/zpr/bean/*.class");
//		for (Resource resource : resources) {
//			SimpleMetadataReaderFactory factory = new SimpleMetadataReaderFactory();
//			String className = factory.getMetadataReader(resource).getClassMetadata().getClassName();
//			System.out.println(className);
//		}


//		AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(context);
//		reader.register(UserService.class);
//		context.refresh();
//		UserService userService = (UserService)context.getBean("userService");
//		System.out.println(userService);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Object userService = context.getBean("userService");

	}

	@Test
	public void testMerged() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Object userService = context.getBean("userService");
	}


}
