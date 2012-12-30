package com.trading.formbacking.index;

import java.io.Serializable;

/**
 * @author Tomer Cohen
 */
public class ChooseStrategyBean implements Serializable {
    private static final long serialVersionUID = 637312512827971076L;

    private Strategy action;

    public Strategy getAction() {
        return action;
    }

    public void setAction(Strategy action) {
        this.action = action;
    }
}
