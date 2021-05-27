package p03.multi_type_parameter;

import java.util.HashMap;

public class Product<T, M> {
	// key, value
	HashMap<T, M> hm = new HashMap<T, M>();
	private T kind;
	private M model;

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

}
