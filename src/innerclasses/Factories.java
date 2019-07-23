package innerclasses;

import static util.Print.*;

interface Service{
	void method1();
	void method2();
}

interface ServiceFactory{
	Service getService();
}

class Implementation1 implements Service{

	public void method1() {
		print("Implementation1 method1");
	}

	public void method2() {
		print("Implementation1 method2");
	}
	public static ServiceFactory factory=new ServiceFactory() {
		
		public Service getService() {
			return new Implementation1();
		}
	};
}

class Implementation2 implements Service{

	public void method1() {
		print("implementation2 method1");
	}

	public void method2() {
		print("implementation method2");
	}
	public static ServiceFactory factory=new ServiceFactory() {
		
		public Service getService() {
			return new Implementation2();
		}
	};
}

public class Factories{
	public static void ServiceConsumer(ServiceFactory factory) {
		Service service=factory.getService();
		service.method1();
		service.method2();
	}
	public static void main(String[] args) {
		ServiceConsumer(Implementation1.factory);
		ServiceConsumer(Implementation2.factory);
	}
}