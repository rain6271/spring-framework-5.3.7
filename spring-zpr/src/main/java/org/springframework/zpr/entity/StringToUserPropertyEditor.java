package org.springframework.zpr.entity;

import org.springframework.stereotype.Component;
import org.springframework.zpr.bean.User;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

/**
 * TODO
 *
 * @author WangYu
 * @date 2023/11/29 16:37
 */
@Component
public class StringToUserPropertyEditor extends PropertyEditorSupport implements PropertyEditor {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        User user = new User();
        user.setName(text);
//        this.setValue(user);
        super.setValue(user);
    }
}
