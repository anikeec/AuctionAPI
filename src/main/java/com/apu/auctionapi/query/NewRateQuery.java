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
public class NewRateQuery extends AuctionQuery {
    private Integer lotId;
    private Integer price;

    public NewRateQuery(long packetId, int userId, String time) {
        this(null, null, packetId, userId, time);
    }

    public NewRateQuery(Integer lotId, Integer price, long packetId, int userId, String time) {
        super(QueryType.NEW_RATE, packetId, userId, time);
        this.lotId = lotId;
        this.price = price;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
