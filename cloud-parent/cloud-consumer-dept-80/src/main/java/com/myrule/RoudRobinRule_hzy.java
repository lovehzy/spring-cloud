package com.myrule;

import java.util.List;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

public class RoudRobinRule_hzy extends AbstractLoadBalancerRule{
	
    private int total=0;
    private int index=0;
    
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();  //当前注册进来的服务数
            
            //当前服务处理了五此后就换下一个服务
            if(total>=5) {
            	total=0;
            	if(++index>=serverCount) {
            		index=0;
            	}
            }
            
            server = upList.get(index);
            total++;
            if (server == null) {
            	/*唯一可能发生的情况是服务器列表以某种方式被删除。
            	这是一个暂时的情况。
            	屈服后重试。*/
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            // 真的不应该发生。但必须是暂时的或错误。
            server = null;
            Thread.yield();
        }

        return server;

    }

 @Override
 public Server choose(Object key) {
   return choose(getLoadBalancer(), key);
 }

 @Override
 public void initWithNiwsConfig(IClientConfig clientConfig) {
   // TODO Auto-generated method stub
   
 }

}
