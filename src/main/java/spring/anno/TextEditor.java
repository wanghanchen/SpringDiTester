package spring.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
   private SpellChecker spellChecker;
   
	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}
   //相当于自动装配byType
   /*@Autowired*/
	//相当于自动装配byName
   @Resource(name="spellChecker")
   public void setSpellChecker( SpellChecker spellChecker ){
      this.spellChecker = spellChecker;
   }
   public SpellChecker getSpellChecker( ) {
      return spellChecker;
   }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }
}
