package org.springframework.zpr.cycle;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
@Data
public class PersonBeanPostProcessor implements BeanPostProcessor {

	public PersonBeanPostProcessor() {
		System.out.println("这是BeanPostProcessor实现类构造器！！");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
