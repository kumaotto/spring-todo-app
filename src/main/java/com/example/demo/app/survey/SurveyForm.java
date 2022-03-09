package com.example.demo.app.survey;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class SurveyForm {

    @Min(0)
    @Max(150)
    private Integer age;

    @Min(1)
    @Max(5)
    private Integer satisfaction;

    @Size(min = 1, max = 200, message = "Please fill charactor size whthin 200")
    private String comment;

    // constractor
    public SurveyForm() {
    }

    // getter / setter
    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSatisfaction() {
        return this.satisfaction;
    }

    public void setSatisfaction(Integer satisfaction) {
        this.satisfaction = satisfaction;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
