package groovypack

class Example {
	static void main(args) { 
		
	
	// TODO Auto-generated method stub 
	def diameter= 10
	def b=3.14
	def circumfrance= 2 * diameter * b
	
	
	System.out.println("The total is="+circumfrance );
	//System.out.println("Hello World!"); 
	
	def clos = {param->println "Hello ${param}"}; clos.call("World");
	
	}
	
}


