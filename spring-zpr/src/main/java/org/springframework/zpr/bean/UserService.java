package org.springframework.zpr.bean;

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
public class UserService {

	@Value("user")
	private User user;

	@Resource
	private OrderService orderService;

}
