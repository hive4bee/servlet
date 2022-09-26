package hello.servlet.handler;

import hello.servlet.ModelView;

import java.util.Map;

public interface MyHandler {
    ModelView process(Map<String, String> paramMap);
}
