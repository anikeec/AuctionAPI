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
public class LoadLotsQuery  extends AuctionQuery {
    
    public LoadLotsQuery(int userId) {
        this(0, userId, "");
    }
    
    public LoadLotsQuery(long packetId, int userId) {
        this(packetId, userId, "");
    }

    public LoadLotsQuery(long packetId, int userId, String time) {
        super(QueryType.LOAD_LOTS, packetId, userId, time);
    }
    
}
