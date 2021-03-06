/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CmCreateOpsAction extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -802022007;

    /**
     * The parameter <code>kloopzcm.cm_create_ops_action.p_action_name</code>.
     */
    public static final Parameter<String> P_ACTION_NAME = createParameter("p_action_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.cm_create_ops_action.p_ops_proc_id</code>.
     */
    public static final Parameter<Long> P_OPS_PROC_ID = createParameter("p_ops_proc_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>kloopzcm.cm_create_ops_action.p_ci_id</code>.
     */
    public static final Parameter<Long> P_CI_ID = createParameter("p_ci_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>kloopzcm.cm_create_ops_action.p_state_name</code>.
     */
    public static final Parameter<String> P_STATE_NAME = createParameter("p_state_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.cm_create_ops_action.p_exec_order</code>.
     */
    public static final Parameter<Integer> P_EXEC_ORDER = createParameter("p_exec_order", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>kloopzcm.cm_create_ops_action.p_critical</code>.
     */
    public static final Parameter<Boolean> P_CRITICAL = createParameter("p_critical", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>kloopzcm.cm_create_ops_action.p_extra_info</code>.
     */
    public static final Parameter<String> P_EXTRA_INFO = createParameter("p_extra_info", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>kloopzcm.cm_create_ops_action.p_arglist</code>.
     */
    public static final Parameter<String> P_ARGLIST = createParameter("p_arglist", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>kloopzcm.cm_create_ops_action.p_payload</code>.
     */
    public static final Parameter<String> P_PAYLOAD = createParameter("p_payload", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public CmCreateOpsAction() {
        super("cm_create_ops_action", Kloopzcm.KLOOPZCM);

        addInParameter(P_ACTION_NAME);
        addInParameter(P_OPS_PROC_ID);
        addInParameter(P_CI_ID);
        addInParameter(P_STATE_NAME);
        addInParameter(P_EXEC_ORDER);
        addInParameter(P_CRITICAL);
        addInParameter(P_EXTRA_INFO);
        addInParameter(P_ARGLIST);
        addInParameter(P_PAYLOAD);
    }

    /**
     * Set the <code>p_action_name</code> parameter IN value to the routine
     */
    public void setPActionName(String value) {
        setValue(P_ACTION_NAME, value);
    }

    /**
     * Set the <code>p_ops_proc_id</code> parameter IN value to the routine
     */
    public void setPOpsProcId(Long value) {
        setValue(P_OPS_PROC_ID, value);
    }

    /**
     * Set the <code>p_ci_id</code> parameter IN value to the routine
     */
    public void setPCiId(Long value) {
        setValue(P_CI_ID, value);
    }

    /**
     * Set the <code>p_state_name</code> parameter IN value to the routine
     */
    public void setPStateName(String value) {
        setValue(P_STATE_NAME, value);
    }

    /**
     * Set the <code>p_exec_order</code> parameter IN value to the routine
     */
    public void setPExecOrder(Integer value) {
        setValue(P_EXEC_ORDER, value);
    }

    /**
     * Set the <code>p_critical</code> parameter IN value to the routine
     */
    public void setPCritical(Boolean value) {
        setValue(P_CRITICAL, value);
    }

    /**
     * Set the <code>p_extra_info</code> parameter IN value to the routine
     */
    public void setPExtraInfo(String value) {
        setValue(P_EXTRA_INFO, value);
    }

    /**
     * Set the <code>p_arglist</code> parameter IN value to the routine
     */
    public void setPArglist(String value) {
        setValue(P_ARGLIST, value);
    }

    /**
     * Set the <code>p_payload</code> parameter IN value to the routine
     */
    public void setPPayload(String value) {
        setValue(P_PAYLOAD, value);
    }
}
