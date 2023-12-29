package org.springframework.zpr.cycle;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

@Data
@Component
public class PersonBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public PersonBeanFactoryPostProcessor() {
		System.out.println("这是PersonBeanFactoryPostProcessor实现类构造器！！");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out
				.println("BeanFactoryPostProcessor调用postProcessBeanFactory方法");
		BeanDefinition bd = beanFactory.getBeanDefinition("person");
		bd.getPropertyValues().addPropertyValue("phone", "110");
	}
}
