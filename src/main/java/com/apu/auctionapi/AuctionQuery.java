/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.auctionapi;

import com.apu.auctionapi.QueryType;

/**
 *
 * @author apu
 */
public abstract class AuctionQuery {
    private QueryType queryType;
    private String time;
    private long packetId;
    private int userId;

    public AuctionQuery(QueryType queryType, long packetId, int userId, String time) {
        this.queryType = queryType;
        this.packetId = packetId;
        this.userId = userId;        
        this.time = time;
    }

    public QueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryType queryType) {
        this.queryType = queryType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getPacketId() {
        return packetId;
    }

    public void setPacketId(long packetId) {
        this.packetId = packetId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
    
}
