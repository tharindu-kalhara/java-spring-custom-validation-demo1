package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by kalhara@boswin on 10/15/2018 9:26 PM.
 */


@Getter
@Setter
@ToString
@HomePageEmptyMessage(msg = {"msg1", "msg2", "msg3"})
public class Student implements Serializable {

    @NotNull
    private Integer studentId;

    @NotNull
    private Integer vehicleType; // 1 - bus / 2- car


    @Valid
    private StudentBus studentBus;
    @Valid
    private StudentCar studentCar;


}
