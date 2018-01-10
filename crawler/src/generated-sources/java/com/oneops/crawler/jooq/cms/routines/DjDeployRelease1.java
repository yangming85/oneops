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
public class DjDeployRelease1 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1187834006;

    /**
     * The parameter <code>kloopzcm.dj_deploy_release.p_release_id</code>.
     */
    public static final Parameter<Long> P_RELEASE_ID = createParameter("p_release_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>kloopzcm.dj_deploy_release.p_created_by</code>.
     */
    public static final Parameter<String> P_CREATED_BY = createParameter("p_created_by", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.dj_deploy_release.p_comments</code>.
     */
    public static final Parameter<String> P_COMMENTS = createParameter("p_comments", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.dj_deploy_release.out_deployment_id</code>.
     */
    public static final Parameter<Long> OUT_DEPLOYMENT_ID = createParameter("out_deployment_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public DjDeployRelease1() {
        super("dj_deploy_release", Kloopzcm.KLOOPZCM);

        addInParameter(P_RELEASE_ID);
        addInParameter(P_CREATED_BY);
        addInParameter(P_COMMENTS);
        addOutParameter(OUT_DEPLOYMENT_ID);
        setOverloaded(true);
    }

    /**
     * Set the <code>p_release_id</code> parameter IN value to the routine
     */
    public void setPReleaseId(Long value) {
        setValue(P_RELEASE_ID, value);
    }

    /**
     * Set the <code>p_created_by</code> parameter IN value to the routine
     */
    public void setPCreatedBy(String value) {
        setValue(P_CREATED_BY, value);
    }

    /**
     * Set the <code>p_comments</code> parameter IN value to the routine
     */
    public void setPComments(String value) {
        setValue(P_COMMENTS, value);
    }

    /**
     * Get the <code>out_deployment_id</code> parameter OUT value from the routine
     */
    public Long getOutDeploymentId() {
        return get(OUT_DEPLOYMENT_ID);
    }
}
