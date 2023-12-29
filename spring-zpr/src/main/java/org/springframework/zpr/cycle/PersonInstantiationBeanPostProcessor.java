package org.springframework.zpr.cycle;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

@Data
@Component
public class PersonInstantiationBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {


	public PersonInstantiationBeanPostProcessor() {
		System.out.println("这是InstantiationAwareBeanPostProcessorAdapter实现类构造器！！");
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor调用postProcessBeforeInstantiation方法");
		return super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor调用postProcessAfterInstantiation方法");
		return super.postProcessAfterInstantiation(bean, beanName);
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor调用postProcessProperties方法");
		PropertyValues propertyValues = super.postProcessProperties(pvs, bean, beanName);
		return propertyValues;
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor调用postProcessProperties方法");
		return super.postProcessPropertyValues(pvs, pds, bean, beanName);
	}
}
