package com.jpa.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer
{
   public void configureMessageBroker(MessageBrokerRegistry config)
   {
	  config.enableSimpleBroker("/topic");
	  config.setApplicationDestinationPrefixes("/app");
	  
   }
   
   public void registerStompEndpoints(StompEndpointRegistry registery)
   {
	   registery.addEndpoint("/chat").withSockJS();
   }
}
