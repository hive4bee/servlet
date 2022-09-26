package hello.servlet.handler.controller;

import hello.servlet.ModelView;
import hello.servlet.handler.MyHandler;

import java.util.Map;

public class FormController implements MyHandler {
    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
