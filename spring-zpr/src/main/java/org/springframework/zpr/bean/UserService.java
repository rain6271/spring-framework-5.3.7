package org.springframework.zpr.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author WangYu
 * @date 2023/11/29 16:37
 */
@Component
@Data
public class UserService {

	@Value("user")
	private User user;

	@Resource
	private OrderService orderService;

	private String flag;

}
