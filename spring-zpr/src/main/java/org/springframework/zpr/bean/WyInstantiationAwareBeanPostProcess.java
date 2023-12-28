package org.springframework.zpr.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Component
public class WyInstantiationAwareBeanPostProcess implements InstantiationAwareBeanPostProcessor {


	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException{
		if ("userService".equals(beanName)) {
			Object obj = null;
			try {
				obj = beanClass.newInstance();

				Method[] methods = beanClass.getMethods();
				for (Method method : methods) {
					if (method.getName().equals("setFlag")) {
						method.invoke(obj, "wangyu");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return obj;
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println(bean);
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
	}
}
