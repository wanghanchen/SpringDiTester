package spring.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

	@Bean
	public TextEditor textEditor(){
		return new TextEditor( spellChecker() );
	}
	
	@Bean
	public SpellChecker spellChecker(){
		return new SpellChecker();
	}
}
