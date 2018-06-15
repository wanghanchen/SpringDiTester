package spring.aop.test;

public class Logging {

	/**
	 * 执行before建议
	 */
	public void beforeAdvice(){
		System.out.println("Going to setup student profile");
	}
	
	/**
	 * 执行after建议
	 */
	public void afterAdvice(){
		System.out.println("Student profile has been setup");
	}
	
	/**
	 * 执行成功after建议
	 */
	public void afterReturningAdvice(Object retVal){
		System.out.println("Returning :" + retVal);
	}
	
	/**
	 * 执行异常after建议
	 */
	public void afterThrowingAdvice(IllegalArgumentException  ex){
		System.out.println("There has been an exception :" + ex.toString());
	}
}
