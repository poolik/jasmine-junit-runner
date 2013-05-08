package com.poolik.junit.jasmine;

import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ScriptableObject;

class JasmineSpecFailureException extends Exception {

	private final ScriptableObject trace;

	public JasmineSpecFailureException(NativeObject specResultItem) {
		this.trace = (ScriptableObject) specResultItem.get("trace", specResultItem);
	}

	@Override
	public String getMessage() {
		return (String) trace.get("message", trace);
	}

}
