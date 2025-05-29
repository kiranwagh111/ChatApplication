package com.jpa.test.controller;

import java.time.LocalDateTime;

import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Controller;

import com.jpa.test.model.ChatMessage;

@Controller
public class ChatController {

	public ChatMessage sendMesage(ChatMessage message)
	{
		message.setTimestamp(LocalDateTime.now().toString());
		return message;
	}
}
