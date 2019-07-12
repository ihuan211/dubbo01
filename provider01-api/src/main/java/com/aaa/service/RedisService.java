package com.aaa.service;

import com.aaa.bean.Person;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public interface RedisService {
   /**
    * key是否存在
    * @param key
    * @return
    */
   boolean existsKey(String key);

   /**
    * 重名名key，如果newKey已经存在，则newKey的原值被覆盖
    *
    * @param oldKey
    * @param newKey
    */
    void renameKey(String oldKey, String newKey);

   /**
    * newKey不存在时才重命名
    *
    * @param oldKey
    * @param newKey
    * @return 修改成功返回true
    */
    boolean renameKeyNotExist(String oldKey, String newKey);

   /**
    * 删除key
    *
    * @param key
    */
    void deleteKey(String key);

   /**
    * 删除多个key
    *
    * @param keys
    */
    void deleteKey(String... keys);

   /**
    * 删除Key的集合
    *
    * @param keys
    */
    void deleteKey(Collection<String> keys);

   /**
    * 设置key的生命周期
    *
    * @param key
    * @param time
    * @param timeUnit
    */
    void expireKey(String key, long time, TimeUnit timeUnit);

   /**
    * 指定key在指定的日期过期
    *
    * @param key
    * @param date
    */
    void expireKeyAt(String key, Date date);

   /**
    * 查询key的生命周期
    *
    * @param key
    * @param timeUnit
    * @return
    */
    long getKeyExpire(String key, TimeUnit timeUnit);

   /**
    * 将key设置为永久有效
    *
    * @param key
    */
    void persistKey(String key);

    /**
     * 永久缓存
     * @param key
     * @param obj
     */
    void cacheObject(String key, String obj);

    /**
     * 获取缓存
     * @param key
     * @return
     */
    String getCacheObject(String key);

    List<Person> getAll();
}
