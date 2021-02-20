package com.example.dummy.controller;

import com.example.dummy.model.MessageModel;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class DummyController
{

    @GetMapping("/message/{myMessage}")
    public String getMessage(@PathVariable String myMessage)
    {
        return "hello there my message for you is: "+myMessage;
    }

    @PostMapping("/messagepost")
    public String getMessagePost(@RequestBody MessageModel messageModel, HttpServletRequest request)
    {
        if(messageModel.getMessage().isEmpty() || messageModel.getMessage().length()==0)
        {
            return "no message has been written";
        }
        return "hello there my message for you is: "+messageModel.getMessage();
    }

}
