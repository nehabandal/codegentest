package cs652.j.codegen.model;

import cs652.j.semantics.JClass;

import java.util.ArrayList;
import java.util.List;

public class ClassDef extends OutputModelObject {
	public JClass clazz;
	@ModelElement public List<VarDef> fields = new ArrayList<>();
	@ModelElement public List<MethodDef> methods = new ArrayList<>();
	@ModelElement public List<FuncName> vtable = new ArrayList<>();

	public ClassDef(JClass clazz) {
		this.clazz = clazz;
	}

	public String getName() {
		return clazz.getName();
	}
}
