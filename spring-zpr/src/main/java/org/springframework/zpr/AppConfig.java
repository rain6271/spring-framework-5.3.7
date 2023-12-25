package org.springframework.zpr;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.zpr.bean.User;
import org.springframework.zpr.entity.StringToUserPropertyEditor;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author WangYu
 * @date 2023/11/29 16:23
 */
//@PropertySource("classpath:spring.properties")
@ComponentScan("org.springframework.zpr.bean")
public class AppConfig {
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }

    @Bean
    public CustomEditorConfigurer customEditorConfigurer() {
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        Map<Class<?>, Class<? extends PropertyEditor>> customEditorMap = new HashMap<>();
        customEditorMap.put(User.class, StringToUserPropertyEditor.class);
        customEditorConfigurer.setCustomEditors(customEditorMap);
        return customEditorConfigurer;
    }
}
