/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.auctionapi.query;

import com.apu.auctionapi.AuctionQuery;
import com.apu.auctionapi.QueryType;

/**
 *
 * @author apu
 */
public class SubscribeQuery extends AuctionQuery {
    
    private int lotId;
    
    public SubscribeQuery(long packetId, int userId, String time) {
        this(packetId, userId, time, 0);
    }
    
    public SubscribeQuery(long packetId, int userId, String time, int lotId) {
        super(QueryType.SUBSCRIBE, packetId, userId, time);
        this.lotId = lotId;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }
    
}
