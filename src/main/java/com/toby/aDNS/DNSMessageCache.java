package com.toby.aDNS;

import org.xbill.DNS.Message;
import org.xbill.DNS.Record;

import java.util.HashMap;

public class DNSMessageCache {
    private DNSMessageCache() {
    }

    private static HashMap<Integer, Message> cacheMap = new HashMap<Integer, Message>();

    public static void put(Integer hash, Message msg) {
        cacheMap.put(hash, msg);
    }

    public static Message get(Integer hash) {
        return cacheMap.get(hash);
    }

    public static void clear() {
        cacheMap.clear();
    }
}
