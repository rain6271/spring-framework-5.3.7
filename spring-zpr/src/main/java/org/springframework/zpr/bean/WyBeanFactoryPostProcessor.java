package org.springframework.zpr.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author WangYu
 * @date 2023/12/2 19:21
 */
@Component
public class WyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("干涉BeanFactory创建");
		BeanDefinition userService = beanFactory.getBeanDefinition("userService");
		userService.setPrimary(Boolean.TRUE);


		System.out.println(userService);
	}
}
