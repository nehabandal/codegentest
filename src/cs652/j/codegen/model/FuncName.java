package cs652.j.codegen.model;

import cs652.j.semantics.JMethod;

/** Represents how a *function* name is derived from a *method* name */
public class FuncName extends OutputModelObject {
	public JMethod method;

	public FuncName(JMethod method) {
		this.method = method;
	}
}
