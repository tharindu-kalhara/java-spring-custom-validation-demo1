package com.example.demo.dto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by kalhara@boswin on 10/16/2018 9:46 AM.
 */
public class HomePageEmptyMessageValidator implements ConstraintValidator<HomePageEmptyMessage, Student> {

    private HomePageEmptyMessage homePageEmptyMessage;

    @Override
    public void initialize(HomePageEmptyMessage constraintAnnotation) {
        this.homePageEmptyMessage = constraintAnnotation;
        //        System.out.println("constraintAnnotation.message() " + constraintAnnotation.message());
//        constraintAnnotation.msg();
//        System.out.println("HomePageEmptyMessageValidator.initialize");
//        System.out.println(constraintAnnotation.toString());
    }

    @Override
    public boolean isValid(Student value, ConstraintValidatorContext context) {
//        System.out.println("HomePageEmptyMessageValidator.isValid");
//
//        System.out.println("value > " + value);
        String[] msg = homePageEmptyMessage.msg();

        for (String s : msg) {
            System.out.println("s > " + s);
        }
        context.disableDefaultConstraintViolation();
        if (value.getVehicleType() == 1) {
            if (value.getStudentBus() == null) {
                context.buildConstraintViolationWithTemplate("Bus null").addConstraintViolation();
                return false;
            } else {
                return true;
            }
        } else if (value.getVehicleType() == 2) {
            if (value.getStudentCar() == null) {
                context.buildConstraintViolationWithTemplate("car null").addConstraintViolation();
                return false;
            } else {
                return true;
            }
        }
        return false;
    }


}
