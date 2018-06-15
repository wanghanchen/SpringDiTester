package com.cookie.SpringEx;

public class TextEditor {
	
	private SpellChecker spellChecker;
	private String name;
	//Spring 基于构造函数的依赖注入
	/*public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}*/
	
	//Spring 基于设置函数的依赖注入
	public void setSpellChecker(SpellChecker spellChecker){
		//System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker(){
		return spellChecker;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}

}
