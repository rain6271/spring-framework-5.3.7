package org.springframework.zpr.cycle;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Data
public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

	private String name;

	private String address;

	private String phone;

	public String getName() {
		return name;
	}

	@Value("wangyu")
	public void setName(String name) {
		System.out.println("【注入属性】注入属性name");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	@Value("qingdao")
	public void setAddress(String address) {
		System.out.println("【注入属性】注入属性address");
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	@Value("13666666666")
	public void setPhone(String phone) {
		System.out.println("【注入属性】注入属性phone");
		this.phone = phone;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("【BeanFactoryAware接口】BeanNameAware.setBeanName()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("【DiposibleBean接口】调用DiposibleBean.destory()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("【InitializingBean】调用InitializingBean.afterPropertiesSet()");
	}

	public void myInit() {
		System.out.println("my init....");
	}

	public void myDestory() {
		System.out.println("my destroy....");
	}

}
