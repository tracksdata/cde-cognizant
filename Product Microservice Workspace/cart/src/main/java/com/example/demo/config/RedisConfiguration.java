package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.example.demo.model.ItemLine;

@Configuration
public class RedisConfiguration {

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory(); // localhost: 6379
	}

	@Bean
	public RedisTemplate<String, ItemLine> redisTemplate() {
		final RedisTemplate<String, ItemLine> template = new RedisTemplate<String, ItemLine>();
		template.setConnectionFactory(jedisConnectionFactory());
		return template;
	}

}
