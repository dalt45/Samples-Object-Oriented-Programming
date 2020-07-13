class Main {
	public static void main( String[] args){
		System.out.println("Hola Mundo")
		Car car = new Car("AMQ123", new Account("Andrés Herrera","AND123"));
		car.passenger = 4;
		car.printDataCar();
		
		Car car2 = new Car("QWE587", new Account("Andrea Herrera","QWE587"));
		car2.driver = 3;
		car2.printDataCar();
	}
}