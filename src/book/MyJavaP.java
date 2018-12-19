package book;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MyJavaP {
	Modifier m = new Modifier();
	
	public static void main(String[] args) throws Exception {
		MyJavaP pp = new MyJavaP();
		if(args.length == 0) {
			System.err.println("Usage : javap className[...]");
			System.exit(1);
		}else {
			for (int i = 0; i < args.length; i++) {
				pp.doClass(args[i]);
			}
		}
	}

	protected void doClass(String className) throws Exception {
		// TODO Auto-generated method stub
		Class c = Class.forName(className);
		System.out.println(m.toString(c.getModifiers())+' '+c+"{");
		int i, mods;
		Field fields[] = c.getFields();
		for (int j = 0; j < fields.length; j++) {
			if(!m.isPrivate(fields[j].getModifiers())&& !m.isProtected(fields[j].getModifiers())) {
				System.out.println("\t"+fields[j]);
			}
		}
		Method methods[] = c.getMethods();
		for (int j = 0; j < methods.length; j++) {
			if(!m.isPrivate(methods[j].getModifiers())&& !m.isProtected(methods[j].getModifiers())) {
				System.out.println("\t"+methods[j]);
			}
		}
		
	}
}
