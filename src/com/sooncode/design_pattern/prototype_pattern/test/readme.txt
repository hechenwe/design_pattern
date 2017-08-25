               原型模式 
1.定义一个接口
public interface Prototype<T>    {
	public T cloneObject(T object);
}

2. 定义复制类 : 

public class CPUPrototype implements Prototype<CPU> {

	@Override
	public CPU cloneObject(CPU object) {
		String brand = object.getBrand() != null ? new String(object.getBrand()) : null;
		String version = object.getVersion() != null ? new String(object.getVersion()) : null;
		Double frequency = object.getFrequency() !=null ? new Double(object.getFrequency()) : null;
		CPU cpu = new CPU();
		cpu.setBrand(brand);
		cpu.setFrequency(frequency);
		cpu.setVersion(version);
		return cpu;
	}
 

	 
}

public class MainboardPrototype implements Prototype<Mainboard> {

	@Override
	public Mainboard cloneObject(Mainboard object) {
		if(object == null) {
			return null;
		}
		
		String brand = object.getBrand() == null ? null : new String(object.getBrand());
		Integer memorySize = object.getMemorySize() == null ? null : new Integer(object.getMemorySize());
		
		Mainboard m = new Mainboard();
		m.setBrand(brand);
		m.setMemorySize(memorySize);
		return m ;
		
	}
 
 public class MemoryPrototype implements Prototype<Memory> {

	@Override
	public Memory cloneObject(Memory object) {
	String brand = 	object.getBrand() == null ? null : new String(object.getBrand());
	Double frequency = 	object.getFrequency() == null ? null : new Double(object.getFrequency());
	String producingArea = 	object.getProducingArea() == null ? null :new String(object.getProducingArea());
	Memory m = new Memory();
	m.setBrand(brand);
	m.setFrequency(frequency);
	m.setProducingArea(producingArea);
	return m;
	
	}
 

	 
}
 
 
 public class ComputerPrototype implements Prototype<Computer> {

	@Override
	public Computer cloneObject(Computer computer) {

		CPU cpu = new CPUPrototype().cloneObject(computer.getCpu());
		List<Memory> list = null;
		if (computer.getMemory() != null) {
			for (Memory m : computer.getMemory()) {
				Memory mem = new MemoryPrototype().cloneObject(m);
				list = new ArrayList<>();
				list.add(mem);
			}
		}
		Mainboard mb = new MainboardPrototype().cloneObject(computer.getMainboard());
		Computer c = new Computer();
		c.setCpu(cpu);
		c.setMainboard(mb);
		c.setMemory(list);
		return c;
	}

}

3.定义测试类 

public class Test {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		cpu.setBrand("Intel");
		cpu.setFrequency(34.0);
		cpu.setVersion("I7");
		Computer c = new Computer();
		c.setCpu(cpu);
-----------------------------------------------------------------		
		Computer c2 = new ComputerPrototype().cloneObject(c);
		c2.getCpu().setBrand("AMD");
		System.out.println(  c);
		System.out.println(  c2);
	}
}

4.说明:

原型模式: 
	是想通过这个模式获得一个对象的副本(对这个副本的任何修改,都不影响原来的对象 ),
	将这个对象内部复制的过程,封装在这个模式中. 
	被复制的对象的类不需要额外的任何修改(不需要继承什么类,也不需要实现什么接口)