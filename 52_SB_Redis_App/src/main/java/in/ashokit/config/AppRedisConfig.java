package in.ashokit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class AppRedisConfig {

	@Value("${spring.data.redis.url}")
	private String url;

	@Value("${spring.data.redis.port}")
	private Integer port;

	@Value("${spring.data.redis.username}")
	private String username;

	@Value("${spring.data.redis.password}")
	private String pwd;

	@Bean
	public JedisConnectionFactory jedisConnFactory() {
		RedisStandaloneConfiguration serverConfig = 
				new RedisStandaloneConfiguration(url, port);

		serverConfig.setUsername(username);
		serverConfig.setPassword(pwd);

		JedisClientConfiguration clientConfig = 
				JedisClientConfiguration.builder().build();

		return new JedisConnectionFactory(serverConfig, clientConfig);
	}

	@Bean
	@Primary
	public RedisTemplate<String, String> redisTemplate() {
		RedisTemplate<String, String> rt = new RedisTemplate<>();
		rt.setConnectionFactory(jedisConnFactory());
		return rt;
	}
}
