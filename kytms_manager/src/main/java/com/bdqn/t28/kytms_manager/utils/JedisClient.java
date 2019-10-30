package com.bdqn.t28.kytms_manager.utils;

public interface JedisClient {
   String get(String key);//获取值，类型：String
   String set(String key, String value);//设置值，类型：String
   String hget(String hkey, String key);//获取值，类型：Hash
   long hset(String hkey, String key, String value);//设置值，类型：Hash
   long incr(String key);//自增
   long expire(String key, int seconds);//设置key的过期时间
   long ttl(String key);//查看key的过期时间
   long del(String key); //删除 类型：String
   long hdel(String hkey, String key); // 删除 类型：Hash
}
