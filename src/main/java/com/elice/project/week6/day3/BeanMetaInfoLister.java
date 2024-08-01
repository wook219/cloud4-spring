package com.elice.project.week6.day3;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanMetaInfoLister {

    private final ApplicationContext applicationContext;
    private final ConfigurableListableBeanFactory beanFactory;

    public BeanMetaInfoLister(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
        this.beanFactory = ((AnnotationConfigApplicationContext) applicationContext).getBeanFactory();
    }

    public void listBeanMetaInfo(){
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : allBeanNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            System.out.println("빈 이름 : " + beanName);
            System.out.println("빈 클래스 : " + beanDefinition.getBeanClassName());
            System.out.println("스코프 : " + beanDefinition.getScope());
            System.out.println("지연 초기화 여부 : " + beanDefinition.isLazyInit());
            System.out.println("------------");
        }
    }
}
