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
public class NotifyQuery extends AuctionQuery {
    
    AuctionLotEntity lot;
    
    public NotifyQuery(long packetId, int userId) {
        this(packetId, userId, "");
    }
    
    public NotifyQuery(long packetId, int userId, String time) {
        super(QueryType.NOTIFY, packetId, userId, time);
    } 

    public AuctionLotEntity getLot() {
        return lot;
    }

    public void setLot(AuctionLotEntity lot) {
        this.lot = lot;
    }
    
}
