package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Created by kalhara@boswin on 10/15/2018 9:26 PM.
 */
@Getter
@Setter
@ToString
public class StudentBus {

    @NotNull
    private Integer busId;
    @NotNull
    private String note;


}
