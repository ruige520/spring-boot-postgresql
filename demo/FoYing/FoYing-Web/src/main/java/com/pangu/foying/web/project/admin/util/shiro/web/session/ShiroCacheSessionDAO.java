package com.pangu.foying.web.project.admin.util.shiro.web.session;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;

import java.io.Serializable;

/**
 * @Author 陈漫斌
 * @Description 针对自定义的ShiroSession的db操作
 * @Date 2019/7/17 9:31
 * @Modified By
 */
public class ShiroCacheSessionDAO extends EnterpriseCacheSessionDAO {
    @Override
    protected Serializable doCreate(Session session) {
        return super.doCreate(session);
    }

    @Override
    protected Session doReadSession(Serializable sessionId) {
        return super.doReadSession(sessionId);
    }

    @Override
    protected void doUpdate(Session session) {
        super.doUpdate(session);
    }

    @Override
    protected void doDelete(Session session) {
        super.doDelete(session);
    }
}
