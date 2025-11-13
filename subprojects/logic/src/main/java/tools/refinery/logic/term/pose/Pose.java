/*
 * SPDX-FileCopyrightText: 2021-2024 The Refinery Authors <https://refinery.tools/>
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package tools.refinery.logic.term.pose;

import java.math.BigDecimal;

public record Pose( BigDecimal x, BigDecimal y, BigDecimal phi) {

	public Pose(BigDecimal x, BigDecimal y, BigDecimal phi) {
		this.x = x; this.y = y; this.phi = phi;
	}

	public BigDecimal getX() { return x; }
	public BigDecimal getY() { return y; }
	public BigDecimal getPhi() { return phi; }

	@Override
	public String toString() {
		return x+" "+y+" "+phi;
	}
}
