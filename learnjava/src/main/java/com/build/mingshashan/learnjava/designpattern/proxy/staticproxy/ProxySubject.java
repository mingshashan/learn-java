package com.build.mingshashan.learnjava.designpattern.proxy.staticproxy;

/**
 * 参考
 * {@link https://www.jianshu.com/p/2f518a4a4c2b}
 * 
 * 静态代理类优缺点
 * 优点：业务类只需要关注业务逻辑本身，保证了业务类的重用性。这是代理的共有优点。
 * 缺点：
 * 1）代理对象的一个接口只服务于一种类型的对象，如果要代理的方法很多，势必要为每一种方法都进行代理，静态代理在程序规模稍大时就无法胜任了。
 * 2）如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度。
 * 另外，如果要按照上述的方法使用代理模式，那么真实角色(委托类)必须是事先已经存在的，并将其作为代理对象的内部属性。
 * 但是实际使用时，一个真实角色必须对应一个代理角色，如果大量使用会导致类的急剧膨胀；.
 * 此外，如果事先并不知道真实角色（委托类），该如何使用代理呢？这个问题可以通过Java的动态代理类来解决。
 * @author mingshashan
 */
public class ProxySubject implements Subject{

	private Subject delegate;
	
	public ProxySubject(Subject delegate) {
		this.delegate = delegate;
	}
	
	public void dealTask(String taskName) {
		long start = System.currentTimeMillis();
		
		delegate.dealTask(taskName);
		
		long end = System.currentTimeMillis();
		
		System.out.printf("执行任务耗时%d", (start - end));
	}

}
