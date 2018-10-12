package org.sydai.proxy;

/**
 * 代理接口
 * @author dsy
 */
public interface Proxy {

    /**
     * 执行链式代理
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
