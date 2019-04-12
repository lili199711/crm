package com.briup.util;

import java.util.HashMap;
import java.util.Map;

public class CrmCommonException extends Exception {
	private static final long serialVersionUID = 1L;
	private static final Map<Integer, CrmCommonException> exceptionMap = new HashMap<Integer, CrmCommonException>();
	private static final Map<Integer, String> errmsgMap = new HashMap<Integer, String>();

	static {
		errmsgMap.put(401, "参数为空!");
		errmsgMap.put(402, "用户名密码错误!");
		errmsgMap.put(403, "参数错误！");
		errmsgMap.put(404, "查询结果为空！");
		errmsgMap.put(405, "已经有了分配人!");
		errmsgMap.put(406, "数据保存失败");
		errmsgMap.put(407, "不是已分配状态!");
		errmsgMap.put(408, "不是已处理状态!");
		exceptionMap.put(501, new CrmCommonException(501, getMessage(501)));
	}

	private int errcode;
	private String errmsg;

	public CrmCommonException(int errcode, String msg) {
		super(msg);
		this.errcode = errcode;
		this.errmsg = msg;
	}

	public int getErrcode() {
		return errcode;
	}

	@Override
	public String getMessage() {
		return errmsg;
	}

	public static String getMessage(int errcode) {
		if (errmsgMap.containsKey(errcode)) {
			return errmsgMap.get(errcode);
		}
		else {
			return errmsgMap.get(501);
		}
	}

	public static CrmCommonException getException(int errcode) {
		if (exceptionMap.containsKey(errcode)) {
			return exceptionMap.get(errcode);
		} else if (errmsgMap.containsKey(errcode)) {
			CrmCommonException ex = new CrmCommonException(errcode, getMessage(errcode));
			exceptionMap.put(errcode, ex);
			return ex;
		} else {
			return exceptionMap.get(501);
			
		}
	}

}
