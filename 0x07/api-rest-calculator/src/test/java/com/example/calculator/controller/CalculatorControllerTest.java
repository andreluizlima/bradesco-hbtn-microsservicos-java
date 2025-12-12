package com.example.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void messageWelcome() throws Exception {
       RequestBuilder request = MockMvcRequestBuilders.get("/calculator/welcome");
       MvcResult result = mvc.perform(request).andReturn();
       assertEquals("Bem vindo à CALCULATOR API REST.", result.getResponse().getContentAsString());
    }

    @Test
    void addNumbers() throws Exception {
         RequestBuilder request = MockMvcRequestBuilders.get("/calculator/addNumbers?number1=5&number2=5");
         MvcResult result = mvc.perform(request).andReturn();
         assertEquals("10.0", result.getResponse().getContentAsString());
    }

    @Test
    void subNumbers() throws Exception {
         RequestBuilder request = MockMvcRequestBuilders.get("/calculator/subNumbers?number1=5&number2=5");
         MvcResult result = mvc.perform(request).andReturn();
         assertEquals("0.0", result.getResponse().getContentAsString());
    }

    @Test
    void divideNumbers() throws Exception {
         RequestBuilder request = MockMvcRequestBuilders.get("/calculator/divideNumbers?number1=5&number2=5");
         MvcResult result = mvc.perform(request).andReturn();
         assertEquals("1.0", result.getResponse().getContentAsString());
    }

    @Test
    void factorial() throws Exception {
         RequestBuilder request = MockMvcRequestBuilders.get("/calculator/factorial?factorial=5");
         MvcResult result = mvc.perform(request).andReturn();
         assertEquals("120", result.getResponse().getContentAsString());
    }

    @Test
    void calculeDayBetweenDate() throws Exception {
         RequestBuilder request = MockMvcRequestBuilders.get("/calculator/calculeDayBetweenDate?localDate1=2020-03-15&localDate2=2020-03-29");
         MvcResult result = mvc.perform(request).andReturn();
         assertEquals("14", result.getResponse().getContentAsString());
    }

    @Test
    void integerToBinary() throws Exception {
         RequestBuilder request = MockMvcRequestBuilders.get("/calculator/integerToBinary?number1=5");
         MvcResult result = mvc.perform(request).andReturn();
         assertEquals("101", result.getResponse().getContentAsString());
    }
}