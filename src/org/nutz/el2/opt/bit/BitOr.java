package org.nutz.el2.opt.bit;

import org.nutz.el2.opt.TwoTernary;

/**
 * 或
 * @author juqkai(juqkai@gmail.com)
 *
 */
public class BitOr extends TwoTernary{
	public int fetchPriority() {
		return 10;
	}
	public Object calculate() {
		Integer lval = (Integer) calculateItem(left);
		Integer rval = (Integer) calculateItem(right);
		return lval | rval;
	}
	public String fetchSelf() {
		return "|";
	}
}