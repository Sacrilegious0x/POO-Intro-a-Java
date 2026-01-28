package business;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
//		int result = Test.multiplicacion(5, 10);
//		System.out.println("El resultado de la multiplicacion es: " + result);
//		
//		System.out.println("El fibonacci de 8 es: " + t.fibonacci(8));
		String fileContent = t.readFile("files/numbers.txt");
		String [] listOfNumber = fileContent.split("\n");
		String message = "";
		for(int i =0; i< listOfNumber.length; i++) {
			message += "El fibonacci de " + listOfNumber[i] + " es: " 
						+ t.fibonacci(Integer.parseInt(listOfNumber[i])) + "\n";
		}
		
		t.writeFile(message, "files/fibonacci.txt");
	}
	
}

