package com.cube001.validatasession;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author:张向宇
 * @Description:
 * @Date:Create in 16:03 2018/06/23
 * @Modified By:
 */
@Configuration
public class BeanValidatorConfig extends WebMvcConfigurerAdapter {
    private MessageSource messageSource;

    public BeanValidatorConfig(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public Validator getValidator() {
        return super.getValidator();
    }

    @Bean
    @Primary
    public Validator validator(){
        LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
        validatorFactoryBean.setValidationMessageSource(messageSource);
        return validatorFactoryBean;
    }
}
