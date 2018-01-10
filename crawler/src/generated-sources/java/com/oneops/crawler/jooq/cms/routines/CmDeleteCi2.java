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
public class CmDeleteCi2 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1374996617;

    /**
     * The parameter <code>kloopzcm.cm_delete_ci.p_ci_id</code>.
     */
    public static final Parameter<Long> P_CI_ID = createParameter("p_ci_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>kloopzcm.cm_delete_ci.p_delete4real</code>.
     */
    public static final Parameter<Boolean> P_DELETE4REAL = createParameter("p_delete4real", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>kloopzcm.cm_delete_ci.p_deleted_by</code>.
     */
    public static final Parameter<String> P_DELETED_BY = createParameter("p_deleted_by", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public CmDeleteCi2() {
        super("cm_delete_ci", Kloopzcm.KLOOPZCM);

        addInParameter(P_CI_ID);
        addInParameter(P_DELETE4REAL);
        addInParameter(P_DELETED_BY);
        setOverloaded(true);
    }

    /**
     * Set the <code>p_ci_id</code> parameter IN value to the routine
     */
    public void setPCiId(Long value) {
        setValue(P_CI_ID, value);
    }

    /**
     * Set the <code>p_delete4real</code> parameter IN value to the routine
     */
    public void setPDelete4real(Boolean value) {
        setValue(P_DELETE4REAL, value);
    }

    /**
     * Set the <code>p_deleted_by</code> parameter IN value to the routine
     */
    public void setPDeletedBy(String value) {
        setValue(P_DELETED_BY, value);
    }
}
