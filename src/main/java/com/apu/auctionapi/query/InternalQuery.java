/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.auctionapi.query;

import com.apu.auctionapi.AuctionLotEntity;
import com.apu.auctionapi.AuctionQuery;
import com.apu.auctionapi.QueryType;

/**
 *
 * @author apu
 */
public class InternalQuery extends AuctionQuery {
    
    AuctionLotEntity lot;
    
    public InternalQuery(long packetId, int userId) {
        this(packetId, userId, "");
    }
    
    public InternalQuery(long packetId, int userId, String time) {
        super(QueryType.INTERNAL_QUERY, packetId, userId, time);
    }

    public AuctionLotEntity getLot() {
        return lot;
    }

    public void setLot(AuctionLotEntity lot) {
        this.lot = lot;
    }    
    
}
