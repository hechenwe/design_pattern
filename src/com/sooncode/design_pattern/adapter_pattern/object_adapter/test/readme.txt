               适配器模式(对象适配器) 
 
问题: 对一个类(这个类不属于自己控制的范畴)的方法进行拓展 .


0.有这么一个不可修改的类:
public class CommonDao<T>  {  //由于某种原因,不能实现 Dao 接口, 
 
	public int save(T t) {
		return 0;
	}

	 
	public int delete(T t) {
		return 0;
	}

	 
	public int update(T t) {
		return 0;
	}

	public T get(T t) {
		return t;
	}
	 
}
1.定义一个接口, 包含这个类的所有方法, 和需要拓展的方法:  

public interface Dao<T> {

	public int save(T t);
	public int delete(T t);
	public int update(T t);
	public T get(T t);
	
	
	public int getSize(T t);
}

2.定义一个类,它继承这个不可修改的类 和 实现 拓展的接口:
 public class BaseDao<T> extends CommonDao<T> implements Dao<T>  {

	@Override
	public int getSize(T t) {
		return 0;
	}
	
}

3.测试类 : 

public class Test {
	public static void main(String[] args) {
		Dao<User> dao = new BaseDao<User>();
		dao.save(new User());
		dao.delete(null);
		dao.update(null);
		dao.get(null);
		
		dao.getSize(null);
	}
}
